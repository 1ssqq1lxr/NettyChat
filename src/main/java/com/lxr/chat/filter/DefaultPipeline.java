package com.lxr.chat.filter;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import lombok.Synchronized;

import java.util.Collections;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 默认管道
 *
 * @author lxr
 * @create 2018-01-29 13:36
 **/
public class DefaultPipeline implements  Pipeline{


    private static Multimap<String,Channel> channels = Multimaps.synchronizedMultimap(HashMultimap.create()); // 多端

    private  Filter  header;

    public void  addFilter(Filter ... filters){
        Optional.ofNullable(filters).ifPresent(filters1 -> {
            for (Filter filter:filters1){
                initFilter(filter);
            }
        });
    }

    @Override
    public void addChannnel(String userId,Channel channel) {
        channels.put(userId,channel);
    }

    @Override
    public <T> boolean invokeFilter(ChannelHandlerContext ctx,T t) {
        boolean flag=true;
        if(header!=null){
            Filter index =header;
            for (;index !=null && flag;index=header.next()){
                flag =index.filter(ctx,t);
            }
        }
        return flag;
    }

    private  void  initFilter(Filter filter){
            if(header ==null){
                    header =filter;
            }
            else {
                header.setNext(filter);
            }
    }





}

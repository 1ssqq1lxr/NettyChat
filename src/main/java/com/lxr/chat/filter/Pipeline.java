package com.lxr.chat.filter;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;

/**
 * 过滤器
 *
 * @author lxr
 * @create 2018-01-29 13:32
 **/
public interface Pipeline {

    void  addFilter(Filter ... filters);

    void  addChannnel(String userId,Channel channel);

    <T> boolean invokeFilter(ChannelHandlerContext ctx,T t);

}

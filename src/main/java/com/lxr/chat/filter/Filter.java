package com.lxr.chat.filter;

import io.netty.channel.ChannelHandlerContext;

/**
 * 过滤器
 *
 * @author lxr
 * @create 2018-01-29 13:30
 **/
public interface Filter {

    Filter next();

    void  setNext(Filter next);

    <T> boolean filter(ChannelHandlerContext ctx,T t);

}

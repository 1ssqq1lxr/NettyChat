package com.lxr.chat.handler;

import com.lxr.chat.protocol.ChatCode;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * 处理器
 *
 * @author lxr
 * @create 2018-01-26 17:55
 **/
public class ChatHandler extends SimpleChannelInboundHandler<ChatCode> {


    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ChatCode msg) throws Exception {

    }



}

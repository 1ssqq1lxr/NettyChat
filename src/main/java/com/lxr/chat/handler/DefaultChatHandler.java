package com.lxr.chat.handler;

import com.lxr.chat.channel.ChannelManager;
import com.lxr.chat.filter.Pipeline;
import com.lxr.chat.protocol.ChatCode;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * 处理器
 *
 * @author lxr
 * @create 2018-01-26 17:55
 **/
@Slf4j
@ChannelHandler.Sharable
public class DefaultChatHandler  extends ChatHandler{

    private  Pipeline pipeline;

    private  ChannelManager channelManager;

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ChatCode msg) throws Exception {
                if(pipeline.invokeFilter(ctx,msg)){

                }
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        super.userEventTriggered(ctx, evt);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        log.error("error",cause);
    }

    public ChatHandler pipeline(Pipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    @Override
    public ChatHandler channelManager(ChannelManager channelManager) {
        this.channelManager=channelManager;
        return this;
    }

}

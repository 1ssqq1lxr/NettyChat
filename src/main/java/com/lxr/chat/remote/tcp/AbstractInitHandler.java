package com.lxr.chat.remote.tcp;

import com.lxr.chat.channel.ChannelManager;
import com.lxr.chat.config.ChatConfig;
import com.lxr.chat.filter.DefaultPipeline;
import com.lxr.chat.handler.ChatHandler;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.timeout.IdleStateHandler;

/**
 * @author lxr
 * @create 2018-01-26 14:31
 **/
public abstract class AbstractInitHandler {

    protected void initHandler(ChannelPipeline channelPipeline, ChatConfig cf, ChatHandler channelInboundHandlerAdapter, ChannelInboundHandlerAdapter byteToMessageDecoder, ChannelOutboundHandlerAdapter messageToByteEncoder, DefaultPipeline defaultPipeline, ChannelManager channelManager){
        channelPipeline.addLast(byteToMessageDecoder);
        channelPipeline.addLast(messageToByteEncoder);
        channelPipeline.addLast(new IdleStateHandler(cf.getHeart(),0,0));
        channelPipeline.addLast(channelInboundHandlerAdapter.pipeline(defaultPipeline).channelManager(channelManager));
    }

}

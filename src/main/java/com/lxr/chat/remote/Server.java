package com.lxr.chat.remote;

import com.lxr.chat.channel.ChannelManager;
import com.lxr.chat.config.ChatConfig;
import com.lxr.chat.filter.DefaultPipeline;
import com.lxr.chat.handler.ChatHandler;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelOutboundHandlerAdapter;

/**
 * 链接服务
 *
 * @author lxr
 * @create 2018-01-26 14:18
 **/
public interface Server {
    boolean start(ChatConfig chatConfig, ChatHandler inboundHandlerAdapter,
                  ChannelInboundHandlerAdapter byteToMessageDecoder,
                  ChannelOutboundHandlerAdapter messageToByteEncoder, DefaultPipeline defaultPipeline,
                  ChannelManager channelManager);
}

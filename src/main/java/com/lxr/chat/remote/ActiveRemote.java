package com.lxr.chat.remote;

import com.lxr.chat.channel.ChannelManager;
import com.lxr.chat.config.ChatConfig;
import com.lxr.chat.filter.DefaultPipeline;
import com.lxr.chat.handler.ChatHandler;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

/**
 * 远程
 *
 * @author lxr
 * @create 2018-01-26 14:16
 **/
@Slf4j
public   class ActiveRemote implements  Remote {

    private  final Server server;

    private  final  ChatConfig chatConfig;

    private  final ChatHandler channelInboundHandlerAdapter;

    private final  ChannelInboundHandlerAdapter byteToMessageDecoder;

    private final ChannelOutboundHandlerAdapter messageToByteEncoder;

    private  final DefaultPipeline defaultPipeline;

    private  final ChannelManager channelManager;

    protected ActiveRemote(Server server, ChatConfig chatConfig, ChatHandler channelInboundHandlerAdapter, ChannelInboundHandlerAdapter byteToMessageDecoder, ChannelOutboundHandlerAdapter messageToByteEncoder, DefaultPipeline defaultPipeline, ChannelManager channelManager) {
        this.server = server;
        this.chatConfig = chatConfig;
        this.channelInboundHandlerAdapter = channelInboundHandlerAdapter;
        this.byteToMessageDecoder = byteToMessageDecoder;
        this.messageToByteEncoder = messageToByteEncoder;
        this.defaultPipeline = defaultPipeline;
        this.channelManager = channelManager;
    }

    @Override
    public boolean open() {
        return server.start(chatConfig,channelInboundHandlerAdapter,byteToMessageDecoder,messageToByteEncoder,defaultPipeline,channelManager);
    }


}

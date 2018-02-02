package com.lxr.chat.handler;/**
 * Created by wangcy on 2018/2/2.
 */

import com.lxr.chat.channel.ChannelManager;
import com.lxr.chat.filter.Pipeline;
import com.lxr.chat.protocol.ChatCode;
import com.sun.istack.internal.NotNull;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * 处理器
 *
 * @author lxr
 * @create 2018-02-02 14:32
 **/
public abstract class ChatHandler  extends SimpleChannelInboundHandler<ChatCode> {

    public abstract  ChatHandler pipeline(@NotNull Pipeline pipeline);

    public abstract  ChatHandler channelManager(@NotNull ChannelManager channelManager);
}

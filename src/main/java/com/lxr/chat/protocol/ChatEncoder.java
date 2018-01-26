package com.lxr.chat.protocol;

import com.alibaba.fastjson.JSON;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * 恭喜
 *
 * @author lxr
 * @create 2018-01-26 15:11
 **/
public class ChatEncoder extends MessageToByteEncoder<ChatCode>{

    private  static final  String FIX_HEADER="chat-join-us";

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, ChatCode chatCode, ByteBuf byteBuf) throws Exception {
        byteBuf.writeBytes(FIX_HEADER.getBytes());
        String toJson = toJson(chatCode);
        byteBuf.writeInt(toJson.length());
        byteBuf.writeBytes(toJson.getBytes());
    }

    private  String toJson(ChatCode chatCode){
        return JSON.toJSONString(chatCode);
    }


}

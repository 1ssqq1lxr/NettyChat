package com.lxr.chat.protocol;

import com.alibaba.fastjson.JSON;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * @author lxr
 * @create 2018-01-26 15:15
 **/
public class ChatDecoder extends ByteToMessageDecoder {

    private  static final  String FIX_HEADER="chat-join-us";


    private  ChatCode toJson(String chatCode){
        return JSON.parseObject(chatCode,ChatCode.class);
    }

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        int length = FIX_HEADER.getBytes().length;
        byte[] hreader = new byte[length];
        for(;;){
            int readerIndex = in.readerIndex();
            if(in.readableBytes()<length){
                return ;
            }
            in.readBytes(hreader);
            if(!new String(hreader).equals(FIX_HEADER)){
                in.readerIndex(readerIndex);
                return;
            }
            int bodyLength = in.readInt();
            if(bodyLength==0){
                in.readerIndex(readerIndex);
                return ;
            }
            byte[] body = new byte[bodyLength];
            in.readBytes(body);
            out.add(toJson(new String(body)));
        }
    }


}

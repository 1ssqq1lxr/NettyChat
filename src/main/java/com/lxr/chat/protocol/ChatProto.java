package com.lxr.chat.protocol;

/**
 * 聊天室的协议
 * | head | body
 *   4
 *
 * @author lxr
 * @site nanjing
 * @github https://github.com/1ssqq1lxr
 *
 */
public class ChatProto {

    public static final byte PING_PROTO     =1;  //ping消息
    public static final byte PONG_PROTO     =2;  //pong消息
    public static final byte SYST_PROTO     =3;  //系统消息
    public static final byte EROR_PROTO     =4; //错误消息
    public static final byte AUTH_PROTO     =5; //认证消息
    public static final byte PRI_PROTO      =6;  // 私聊消息
    public static final byte GROUP_PROTO    =7; //群聊消息
    public static final byte STATUS_PROTO   =8; //消息状态

}

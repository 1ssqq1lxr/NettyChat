package com.lxr.chat.protocol;

import com.alibaba.fastjson.JSONObject;
import com.lxr.chat.util.DateTimeUtil;

import java.util.HashMap;
import java.util.Map;

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

    public static final byte PING_PROTO = 1; //ping消息
    public static final byte PONG_PROTO = 2; //pong消息
    public static final byte SYST_PROTO = 3; //系统消息
    public static final int EROR_PROTO =  4; //错误消息
    public static final int AUTH_PROTO =  5; //认证消息
    public static final int PRI_PROTO =  6; // 私聊消息
    public static final int GROUP_PROTO= 7 ; // 群聊消息

}

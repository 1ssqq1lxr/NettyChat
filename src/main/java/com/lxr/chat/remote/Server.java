package com.lxr.chat.remote;

import com.lxr.chat.config.ChatConfig;

/**
 * 链接服务
 *
 * @author lxr
 * @create 2018-01-26 14:18
 **/
public interface Server {
    boolean start(ChatConfig chatConfig);
}

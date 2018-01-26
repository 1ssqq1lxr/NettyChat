package com.lxr.chat.remote;

import com.lxr.chat.config.ChatConfig;
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

    protected ActiveRemote(Server server, ChatConfig chatConfig) {
        this.server = server;
        this.chatConfig = chatConfig;
    }

    @Override
    public boolean open() {
        return server.start(chatConfig);
    }


}

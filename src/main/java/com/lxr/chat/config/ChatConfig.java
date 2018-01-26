package com.lxr.chat.config;

import lombok.Builder;
import lombok.Data;

/**
 * 撇脂
 *
 * @author lxr
 * @create 2018-01-26 14:22
 **/
@Data
@Builder
public class ChatConfig {

    private String ip; // 多网卡

    private int  port;

    private long connectTime;

    private boolean keepalive ;

    private boolean reuseaddr ;

    private boolean tcpNodelay ;

    private  int  sndbuf ;

    private int revbuf ;

    private int heart;

    private int backlog ;

}

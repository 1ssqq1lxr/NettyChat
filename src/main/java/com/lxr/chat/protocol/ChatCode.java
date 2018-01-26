package com.lxr.chat.protocol;

import lombok.Builder;
import lombok.Data;

/**
 * @author lxr
 */
@Data
@Builder
public class ChatCode  {

    private byte type;

    private String userId;

    private long time;

    private String message;

    private String groupId;

    private String toUserId;


}

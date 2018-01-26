package com.lxr.chat.entity;

import lombok.Builder;
import lombok.Data;

/**
 * 用户组 群聊
 *
 * @author lxr
 * @create 2018-01-26 17:50
 **/
@Builder
@Data
public class UserGroup {

    private  int  groupId;

    private  String  userId;

    private  byte  isDelete;

    private  String createDate;

    private  int  level;

}

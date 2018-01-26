package com.lxr.chat.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author lxr
 */

@Data
@Builder
public class UserInfo {

    private  String  userId;

    private  byte   loginStatus;

    private  String  loginTime;

    private  String nikeName;


}

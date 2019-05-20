package com.query;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @ClassName:UserQuery
 * @Author:金
 * @Date:2019/5/15 0015-21:46
 * @Version:1.0
 **/
@Data
public class UserQuery {

    private String sysUserName;
    private LocalDateTime creationTime;
    private String sysUserAccount;
}

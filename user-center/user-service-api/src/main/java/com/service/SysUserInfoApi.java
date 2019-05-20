package com.service;

import com.dto.SysUserInfoDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName:UserService
 * @Author:金
 * @Date:2019/5/18 0018-0:01
 * @Version:1.0
 **/

public interface SysUserInfoApi {

    @GetMapping("/queryUserOne")
    public SysUserInfoDTO queryUserOne(@RequestParam("id") Long id);
}

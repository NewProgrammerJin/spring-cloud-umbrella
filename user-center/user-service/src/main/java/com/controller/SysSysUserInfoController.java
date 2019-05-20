package com.controller;


import com.dto.SysUserInfoDTO;
import com.service.SysUserInfoApi;
import com.service.SysUserInfoService;
import com.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 金
 * @since 2019-05-16
 */
@RestController
public class SysSysUserInfoController extends Result implements SysUserInfoApi {

    @Autowired
    private SysUserInfoService sysUserInfoService;


    @Override
    public SysUserInfoDTO queryUserOne(Long id) {
        return sysUserInfoService.queryUserOne(id);
    }
}


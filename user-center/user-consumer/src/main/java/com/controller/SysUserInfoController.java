package com.controller;

import com.feign.SysUserInfoFeign;
import com.util.Result;
import com.vo.SysUserInfoVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author{作者}
 * @Date{更新日期}2019/5/20-10:58
 */
@Api("用户管理操作接口")
@RestController
public class SysUserInfoController extends Result{
    @Autowired
    private SysUserInfoFeign sysUserInfoFeign;

    @GetMapping("/queryUserOne")
    @ApiImplicitParam(name ="id",value = "用户编号",dataType="String",paramType = "query")
    public Result queryUserOne(@RequestParam("id")Long id){
        SysUserInfoVO sysUserInfoVO = new SysUserInfoVO();
        BeanUtils.copyProperties(sysUserInfoFeign.queryUserOne(id),sysUserInfoVO);
        return setResultSuccess(sysUserInfoVO);
    }

}

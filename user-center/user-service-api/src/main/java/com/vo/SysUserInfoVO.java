package com.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author{作者}
 * @Date{更新日期}2019/5/20-11:08
 */
@ApiModel(value="SysUserInfo对象", description="")
@Data
public class SysUserInfoVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户名")
    private String sysUserName;

    @ApiModelProperty(value = "用户账号")
    private String sysUserAccount;

    @ApiModelProperty(value = "用户状态(0=停用,1=启用)")
    private Integer sysStatus;

    @ApiModelProperty(value = "用户信息")
    private String sysOtherInfo;

}
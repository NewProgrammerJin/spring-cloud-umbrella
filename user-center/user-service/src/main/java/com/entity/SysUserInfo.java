package com.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author 金
 * @since 2019-05-16
 */
@ApiModel(value="SysUserInfo对象", description="")
@Data
public class SysUserInfo implements Serializable {

private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户名")
    private String sysUserName;

    @ApiModelProperty(value = "用户账号")
    private String sysUserAccount;

    @ApiModelProperty(value = "用户密码")
    private String sysUserPassword;

    @ApiModelProperty(value = "用户状态(0=停用,1=启用)")
    private Integer sysStatus;

    @ApiModelProperty(value = "用户信息")
    private String sysOtherInfo;

    @ApiModelProperty(value = "创建日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date creationTime;


}

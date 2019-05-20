package com.service;

import com.dto.SysUserInfoDTO;
import com.entity.SysUserInfo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 金
 * @since 2019-05-16
 */
public interface SysUserInfoService{

    public SysUserInfoDTO queryUserOne(Long id);

    public List<SysUserInfo> queryUserAll();

    public List<SysUserInfo> queryUser(SysUserInfo userInfo);

    public int add(SysUserInfo userInfo);

    public int update(SysUserInfo userInfo);

    public int remove(Long id);


}

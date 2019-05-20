package com.service.impl;

import com.dto.SysUserInfoDTO;
import com.entity.SysUserInfo;
import com.mapper.SysUserInfoMapper;
import com.service.SysUserInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 金
 * @since 2019-05-16
 */
@Service
public class SysUserInfoServiceImpl implements SysUserInfoService {

    @Autowired
    private SysUserInfoMapper sysUserInfoMapper;

    @Override
    public SysUserInfoDTO queryUserOne(Long id){
        SysUserInfo sysUserInfo=sysUserInfoMapper.selectById(id);
        SysUserInfoDTO sysUserInfoDTO=new SysUserInfoDTO();
        if(sysUserInfo!=null) {
            BeanUtils.copyProperties(sysUserInfo, sysUserInfoDTO);
        }
        return sysUserInfoDTO;
    }

    @Override
    public List<SysUserInfo> queryUserAll() {
        List<SysUserInfo> list= sysUserInfoMapper.selectList(null);
        return list;
    }
    @Override
    public List<SysUserInfo> queryUser(SysUserInfo userInfo) {
        return null;
    }


    @Override
    public int add(SysUserInfo userInfo) {
        int i=sysUserInfoMapper.insert(userInfo);
        return i;
    }

    @Override
    public int update(SysUserInfo userInfo) {
        int i=sysUserInfoMapper.update(userInfo,null);
        return i;
    }

    @Override
    public int remove(Long id) {
        int i=sysUserInfoMapper.deleteById(id);
        return i;
    }
}

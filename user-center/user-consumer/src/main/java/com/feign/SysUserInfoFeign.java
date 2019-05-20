package com.feign;

import com.service.SysUserInfoApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 金
 * @since 2019-05-16
 */
@FeignClient("USER-SERVICE")
public interface SysUserInfoFeign extends SysUserInfoApi {




}

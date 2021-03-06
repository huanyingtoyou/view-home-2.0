package com.lihy.view.user.service;

import com.lihy.view.api.feign.UserApi;
import com.lihy.view.common.entity.User;
import com.lihy.view.common.util.ResponseResult;

/**
 * @author lihy
 * @date 2018/04/17
 */
public interface UserService {
    ResponseResult<User> getUserInfoByUserId(String userId);
    ResponseResult<Void> doRegister(User user);
    ResponseResult<Void> doLogin(User user);
}

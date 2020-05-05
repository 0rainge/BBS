package com.bbs.user.service;

import com.bbs.user.model.User;

/**
 * @author: guangxush
 * @create: 2020/05/05
 */
public interface UserService {
    /**
     * 用户登录
     * @param uid
     * @return
     */
    Boolean login(String uid);

    /**
     * 用户注册
     * @param user
     * @return
     */
    User register(User user);

    /**
     * 用户信息保存
     * @param user
     * @return
     */
    User update(User user);
}

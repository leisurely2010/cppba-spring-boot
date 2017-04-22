package com.cppba.repository.custom;

import com.cppba.entity.User;

import java.util.List;

/**
 * 开发者
 * nickName:大黄蜂
 * email:245655812@qq.com
 * github:https://github.com/bigbeef
 */
//用户自定义repository接口
public interface UserRepositoryCustom {
    List<User> findByUserNameAndPassword(String userName,String password);
}

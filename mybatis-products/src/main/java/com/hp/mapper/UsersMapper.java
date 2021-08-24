package com.hp.mapper;

import com.hp.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {
    //登录
    Users login(Users users);
}
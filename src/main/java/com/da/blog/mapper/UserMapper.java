package com.da.blog.mapper;

import com.da.blog.vo.User;
import com.da.blog.vo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * FILE: com.da.blog.mapper.UserMapper.java
 * MOTTO:  不积跬步无以至千里,不积小流无以至千里
 */
@Mapper
public interface UserMapper {
    /**
     * 获取用户凭证
     * @param username 账号
     * @return
     */
    User getUser(@Param("username") String username);

    /**
     * 获取所有的用户
     * @return
     */
    List<User> allUser();

    UserInfo getUserInfo();

    void updateAvatar(@Param("url") String url, @Param("username") String username);

    void updatePassword(User user);

    void updateUserInfo(UserInfo userInfo);
}

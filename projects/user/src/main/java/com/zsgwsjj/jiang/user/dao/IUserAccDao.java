package com.zsgwsjj.jiang.user.dao;

import com.zsgwsjj.jiang.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author : jiang
 * @time : 2018/1/30 17:09
 */
public interface IUserAccDao {

    User getUserByName(String userName);

    int addNewUser(User user);

    void updatePassword(@Param("userName") String userName, @Param("newPassword") String newPassword);
}

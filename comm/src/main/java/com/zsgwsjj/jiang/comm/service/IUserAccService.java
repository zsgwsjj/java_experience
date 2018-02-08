package com.zsgwsjj.jiang.comm.service;

/**
 * @author : jiang
 * @time : 2018/1/29 18:33
 */
public interface IUserAccService {
    String loginWithUserName(String userName, String password);

    void registByUserName(String userName,String password);

    void updatePassword(String userName, String oldPassword, String newPassword);
}

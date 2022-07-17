package com.collegefest.dao;
import com.collegefest.entity.UserInfo;
public interface IUserInfoDAO {
	UserInfo getActiveUser(String userName);
}
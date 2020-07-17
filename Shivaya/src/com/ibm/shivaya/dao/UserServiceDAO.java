package com.ibm.shivaya.dao;

import com.ibm.shivaya.model.RegisterModel;
import com.ibm.shivaya.model.UserModel;

public interface UserServiceDAO {

	public boolean saveUserDetails(UserModel userModel,RegisterModel registerModel)throws Exception;
	public boolean getUserDetails(UserModel userModel)throws Exception;
}

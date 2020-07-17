package com.ibm.shivaya.service;

import com.ibm.shivaya.bean.RegisterBean;
import com.ibm.shivaya.bean.UserBean;

public interface UserService {

	public boolean saveUserDetails(UserBean userBean,RegisterBean registerBean)throws Exception;
	public boolean getUserDetails(UserBean userBean)throws Exception;
	
}

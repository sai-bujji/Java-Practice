package com.ibm.shivaya.serviceimpl;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.shivaya.bean.RegisterBean;
import com.ibm.shivaya.bean.UserBean;
import com.ibm.shivaya.dao.UserServiceDAO;
import com.ibm.shivaya.model.RegisterModel;
import com.ibm.shivaya.model.UserModel;
import com.ibm.shivaya.service.UserService;

@Component("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserServiceDAO userServiceDAO;
	
	private String sourceClass = UserServiceImpl.class.getName();
	Logger logger = Logger.getLogger(sourceClass);
	
	public boolean saveUserDetails(UserBean userBean,RegisterBean registerBean) throws Exception {
		logger.info("========Enter to saveUserDetauls===========");
		RegisterModel registerModel=new RegisterModel();
		registerModel.setUserName(registerBean.getUserName());
		registerModel.setContact(registerBean.getContact());
		registerModel.setPassword(registerBean.getPassword());
		registerModel.setConfirmPassword(registerBean.getConfirmPassword());
		registerModel.setGender(registerBean.getGender());
		registerModel.setMail(registerBean.getMail());
		UserModel userModel= new UserModel();
		userModel.setUserName(registerBean.getUserName());
		userModel.setPassword(registerBean.getPassword());
		boolean saveStaus=userServiceDAO.saveUserDetails(userModel,registerModel);
		logger.info("========saveStaus==========="+saveStaus);
		logger.info("========Exit from saveUserDetauls===========");
		return saveStaus;
	}

	@Override
	public boolean getUserDetails(UserBean userBean) throws Exception {
		logger.info("========Enter to getUserDetails===========");
		UserModel userModel= new UserModel();
		userModel.setUserName(userBean.getUserName());
		userModel.setPassword(userBean.getPassword());
		boolean gatStatus=userServiceDAO.getUserDetails(userModel);
		logger.info("========saveStaus==========="+gatStatus);
		logger.info("========Exit from getUserDetails===========");
		return gatStatus;
	}

}

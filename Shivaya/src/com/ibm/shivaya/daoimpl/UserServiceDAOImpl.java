package com.ibm.shivaya.daoimpl;

import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.shivaya.dao.UserServiceDAO;
import com.ibm.shivaya.model.RegisterModel;
import com.ibm.shivaya.model.UserModel;

@Component("userServiceDAO")
public class UserServiceDAOImpl implements UserServiceDAO {
	
	private String sourceClass = UserServiceDAOImpl.class.getName();
	Logger logger = Logger.getLogger(sourceClass);

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public boolean saveUserDetails(UserModel userModel,RegisterModel registerModel)throws Exception  {
		logger.info("========Enter to saveUserDetails===========");
		boolean saveStaus=false;
		Session session=getSessionFactory().openSession();
		Transaction txt=session.beginTransaction();
		session.save(userModel);
		session.save(registerModel);
		txt.commit();
		saveStaus=true;
		session.close();
		logger.info("========Exit from saveUserDetails===========");
		return saveStaus;
	}

	@Override
	public boolean getUserDetails(UserModel userModel) throws Exception {
		logger.info("========Enter to getUserDetails===========");
		UserModel getUserModel=null;
		boolean getStatus=false;
		Session session=getSessionFactory().openSession();
		getUserModel=(UserModel)session.get(UserModel.class,userModel.getUserName());
		logger.info("========getUserDetails==========="+getUserModel);
		if(getUserModel!=null)
		{
			getStatus=true;
		}
		session.close();
		logger.info("========Exit from getUserDetails===========");
		return getStatus;
	}

}

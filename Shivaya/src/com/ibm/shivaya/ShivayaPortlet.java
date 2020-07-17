package com.ibm.shivaya;

import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.ibm.shivaya.bean.RegisterBean;
import com.ibm.shivaya.bean.UserBean;
import com.ibm.shivaya.service.UserService;

@Controller()
@RequestMapping(value="VIEW")
public class ShivayaPortlet {
	
	private String sourceClass = ShivayaPortlet.class.getName();
	Logger logger = Logger.getLogger(sourceClass);
	
	@Autowired
	Validator validator;
	
	@Autowired
	public UserService userService;
	
	@RequestMapping
	public ModelAndView doView(RenderRequest req,RenderResponse res, @ModelAttribute("userBean") UserBean userBean)
	{
		logger.info("========Enter to doView===========");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("userBean",userBean);
		modelAndView.setViewName("ShivayaPortletView");
		logger.info("========Exit from doView===========");
		return modelAndView;
	}
	@RenderMapping(params="resgisterview=resgisterview")
	public ModelAndView registerPage(RenderRequest req,RenderResponse res, @ModelAttribute("registerBean") RegisterBean registerBean)
	{
		logger.info("========Enter to register===========");
		ModelAndView mav=new ModelAndView();
		mav.addObject("registerBean",registerBean);
		mav.setViewName("registerpage");
		logger.info("========Exit from registerview===========");
		return mav;
	}
	
	@ActionMapping(params="loginActionName=loginActionValue")
	public void loginAction(ActionRequest req, ActionResponse res,@ModelAttribute("userBean")@Valid UserBean userBean,BindingResult results,Model model)
	{
		logger.info("========Enter to loginAction===========");
		validator.validate(userBean, results);
		if(results.hasErrors())
		{
			logger.info("========Inside if ===========");
			model.addAttribute("userBean",userBean);
			res.setRenderParameter("error", "error_page");
		}
		else
		{
			logger.info("========Inside else ===========");
			model.addAttribute("userBean",userBean);
			try
			{
				boolean getStatus=userService.getUserDetails(userBean);
				logger.info("====saveStatus===="+getStatus);
				if(getStatus)
				{
					res.setRenderParameter("welcome", "welcome_page");
				}
				else
				{
					res.setRenderParameter("message", "UserName doesn't exist in database");
					res.setRenderParameter("error", "error_page");
				}
			}
			catch(Exception e)
			{
				logger.info("======Exception======="+e.getCause());
				
			}
			
		}
		
		logger.info("========Exit from loginAction===========");
	}
	@ActionMapping(params="registerNmae=registerValue")
	public void register(ActionRequest req, ActionResponse res,@ModelAttribute("registerBean")@Valid RegisterBean registerBean,BindingResult results,Model model)
	{
		logger.info("========Enter to RegisterAction===========");
			logger.info("========Inside else ===========");
			UserBean userBean=new UserBean();
			try
			{
				logger.info("====saveStatus===="+registerBean.getUserName());
				logger.info("====saveStatus===="+registerBean.getPassword());
				logger.info("====saveStatus===="+registerBean.getConfirmPassword());
				logger.info("====saveStatus===="+registerBean.getGender());
				logger.info("====saveStatus===="+registerBean.getMail());
				logger.info("====saveStatus===="+registerBean.getContact());
				boolean saveStatus=userService.saveUserDetails(userBean, registerBean);
				logger.info("====saveStatus===="+saveStatus);
				if(saveStatus)
				{
					res.setRenderParameter("welcome", "welcome_page");
				}
				else
				{
					res.setRenderParameter("message", "UserName doesn't exist in database");
					res.setRenderParameter("error", "error_page");
				}
			}
			catch(Exception e)
			{
				logger.info("======Exception======="+e.getCause());
				
			}
			
		
		
		logger.info("========Exit from RegisterAction===========");
		
	}
	@RenderMapping(params="error=error_page")
	public ModelAndView errorDetails(RenderRequest req,RenderResponse res, Model model)
	{
		logger.info("========Enter to errorDetails===========");
		ModelAndView mav=new ModelAndView();
		UserBean userBean=new UserBean();
		if(model.containsAttribute("userBean"))
		{
			logger.info("========Errors in userBean===========");
			userBean=(UserBean)model.asMap().get("userBean");
		}
		mav.addObject("userBean",userBean);
		mav.addObject("message",req.getParameter("message"));
		mav.setViewName("ShivayaPortletView");
		logger.info("========Exit from errorDetails===========");
		return mav;
	}
	@RenderMapping(params="welcome=welcome_page")
	public ModelAndView welcomePage(RenderRequest req,RenderResponse res, Model model)
	{
		logger.info("========Enter to welcomePage===========");
		ModelAndView mav=new ModelAndView();
		UserBean userBean=new UserBean();
		if(model.containsAttribute("userBean"))
		{
			logger.info("========Errors in userBean===========");
			userBean=(UserBean)model.asMap().get("userBean");
		}
		mav.addObject("userName",userBean.getUserName());
		mav.setViewName("welcome");
		logger.info("========Exit from welcomePage===========");
		return mav;
	}
	
	
}

package com.zensar.project.actions;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.zensar.project.bean.UserBean;

public class LoginCheck implements Action , ModelDriven<UserBean>,ServletRequestAware , SessionAware{

	private UserBean userBean;
	private HttpServletRequest request;
	private Map map;

	@Override
	public String execute() throws Exception {
		//return SUCCESS;
		if(userBean.getUserName().equals("mazhar") && userBean.getPassWord().equals("zensar")){
			//HttpSession session=request.getSession();
			//session.setAttribute("userBean", userBean);
			map.put("userBean", userBean);
			return SUCCESS;
		}else
			return ERROR;
	}


	@Override
	public UserBean getModel() {
		userBean=new UserBean();
		return userBean;
	}


	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
		
	}


	@Override
	public void setSession(Map map) {
		this.map=map;
		
	}

}

package com.zensar.project.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.zensar.project.bean.UserBean;

public class LoginCheck implements Action , ModelDriven<UserBean>{

	private UserBean userBean;


	@Override
	public String execute() throws Exception {
		//return SUCCESS;
		if(userBean.getUserName().equals("mazhar") && userBean.getPassWord().equals("zensar")){
			return SUCCESS;
		}else
			return ERROR;
	}


	@Override
	public UserBean getModel() {
		userBean=new UserBean();
		return userBean;
	}

}

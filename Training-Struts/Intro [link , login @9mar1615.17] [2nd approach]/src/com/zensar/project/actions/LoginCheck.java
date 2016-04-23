package com.zensar.project.actions;

import com.opensymphony.xwork2.Action;

public class LoginCheck implements Action{

	private UserBean userBean;


	public UserBean getUserBean() {
		return userBean;
	}


	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}


	@Override
	public String execute() throws Exception {
		//return SUCCESS;
		if(userBean.getUserName().equals("mazhar") && userBean.getPassWord().equals("zensar")){
			return SUCCESS;
		}else
			return ERROR;
	}

}

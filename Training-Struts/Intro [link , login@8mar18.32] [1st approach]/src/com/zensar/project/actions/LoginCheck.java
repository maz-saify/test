package com.zensar.project.actions;

import com.opensymphony.xwork2.Action;

public class LoginCheck implements Action{

	String userName,passWord;
	
	
	
	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassWord() {
		return passWord;
	}



	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}



	@Override
	public String execute() throws Exception {
		if(userName.equals("mazhar") && passWord.equals("zensar")){
			return SUCCESS;
		}else
			return ERROR;
	}

}

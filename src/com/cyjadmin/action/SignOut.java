package com.cyjadmin.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Component("signOut")
@Scope("prototype")
public class SignOut extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		ServletActionContext.getRequest().getSession().invalidate();
		return SUCCESS;
	}
}

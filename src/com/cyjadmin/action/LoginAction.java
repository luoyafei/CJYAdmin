package com.cyjadmin.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Component("loginAction")
@Scope("prototype")
public class LoginAction extends ActionSupport {

	private String id;
	private String password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(id==null || password==null || id.trim().hashCode()==0 || password.trim().hashCode()==0) {
			return INPUT;
		} else if(id.equals("luoyafeiLUOYAFEI  luoyafeiLUOYAFEI") && password.equals("luoyafeiLUOYAFEI  luoyafeiLUOYAFEI")) {
			HttpSession session = ServletActionContext.getRequest().getSession();
			session.setAttribute("user", "true");
			return SUCCESS;
		} else {
			return INPUT;
		}
	}
}

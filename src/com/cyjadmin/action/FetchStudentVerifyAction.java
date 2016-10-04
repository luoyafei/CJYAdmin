package com.cyjadmin.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.cyjadmin.bean.User;
import com.cyjadmin.service.UserService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Component(value="fetchStudentVerifyAction")
@Scope("prototype")
public class FetchStudentVerifyAction extends ActionSupport {
	
	private UserService us;
	public UserService getUs() {
		return us;
	}
	@Resource(name="us")
	public void setUs(UserService us) {
		this.us = us;
	}
	
	public void justDoIt() {
		JsonObject jo = new JsonObject();
		HttpServletResponse response = ServletActionContext.getResponse();
//		HttpServletRequest request = ServletActionContext.getRequest();
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = null;

		try {
			out = response.getWriter();
		} catch(IOException e) {}
		List<User> users = us.getAllUsers(0, 10);
		Gson gson = new Gson();
		jo.add("users", gson.toJsonTree(users));
		
		out.print(jo.toString());
		out.flush();
		out.close();
		return;
	}
}

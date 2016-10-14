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
	
	private static final String WAITING_IDENTIFY = "3";//等待审核的状态
	private static final int LENTH = 100;
	
	private UserService us;
	private String start;
	
	public UserService getUs() {
		return us;
	}
	@Resource(name="us")
	public void setUs(UserService us) {
		this.us = us;
	}
	
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	
	public void justDoIt() {
		JsonObject jo = new JsonObject();
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = null;

		try {
			out = response.getWriter();
		} catch(IOException e) {}
		//获取正在等待审核的用户的数量
		int counts = us.getAllVerifyUsersCounts(WAITING_IDENTIFY);
		boolean needSelect = true;;
		if(counts == 0) {
			needSelect = false;
		}
		if(start == null || start.trim().hashCode() == 0) {
			start = "0";
		} else {
			try {
				Integer.parseInt(start);
			} catch(NumberFormatException e) {
				start = "0";
			}
		}
		if(needSelect) {
			List<User> verifyUsers = us.getAllVerifyUsers(WAITING_IDENTIFY, Integer.parseInt(start), LENTH);
			Gson gson = new Gson();
			jo.add("verifyUsers", gson.toJsonTree(verifyUsers));
		}
		jo.addProperty("need", needSelect);
		
		out.print(jo.toString());
		out.flush();
		out.close();
		return;
	}
}

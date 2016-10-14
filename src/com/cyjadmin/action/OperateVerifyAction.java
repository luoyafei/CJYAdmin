package com.cyjadmin.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.cyjadmin.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Component("operateVerifyAction")
@Scope("prototype")
public class OperateVerifyAction extends ActionSupport {
	
	private static final String PV = "1";
	private static final String UPV = "2";
	
	private UserService us;
	private String mark;
	
	public UserService getUs() {
		return us;
	}
	@Resource(name="us")
	public void setUs(UserService us) {
		this.us = us;
	}
	
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	
	
	public void doPass() {
		this.doUpdate(true);
	}
	public void doUnpass() {
		this.doUpdate(false);
	}
	
	private void doUpdate(boolean operate) {
//		JsonObject jo = new JsonObject();
//		HttpServletResponse response = ServletActionContext.getResponse();
//		response.setContentType("application/json; charset=utf-8");
		/*PrintWriter out = null;

		try {
			out = response.getWriter();
		} catch(IOException e) {}*/
		
		if(operate) {
//			jo.addProperty("ok", us.updateUserVerify(mark, PV));
			us.updateUserVerify(mark, PV);
		} else {
//			jo.addProperty("ok", us.updateUserVerify(mark, UPV));
			us.updateUserVerify(mark, UPV);
		}
		
		/*out.print(jo.toString());
		out.flush();
		out.close();*/
		return;
	}
	
}

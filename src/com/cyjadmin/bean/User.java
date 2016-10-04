package com.cyjadmin.bean;

import java.sql.Timestamp;

public class User {
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userNickName=" + userNickName + ", userEmail=" + userEmail
				+ ", userRealName=" + userRealName + ", userPassword=" + userPassword + ", userIntroduce="
				+ userIntroduce + ", userGender=" + userGender + ", userBirthday=" + userBirthday + ", userPhoto="
				+ userPhoto + ", userRealPhoto=" + userRealPhoto + ", userAddress=" + userAddress + ", userIp=" + userIp
				+ ", userWeChat=" + userWeChat + ", userIdCard=" + userIdCard + ", userCreateDate=" + userCreateDate
				+ ", isVerify=" + isVerify + ", userTel=" + userTel + ", copartnerCategory=" + copartnerCategory
				+ ", startAbility=" + startAbility + ", userField=" + userField + ", introduceVideo=" + introduceVideo
				+ "]";
	}
	private String userId = null;
	private String userNickName = null;//用户昵称
	private String userEmail = null;//用户邮箱
	private String userRealName = null;//用户真实姓名
	private String userPassword = "123456";
	private String userIntroduce = null;//个人经历
	private String userGender = null;
	private Timestamp userBirthday = null;
	private String userPhoto = "";//用户头像
	private String userRealPhoto = "";//用户照片
	private String userAddress = null;//所属高校
	private String userIp = null;
	private String userWeChat = null;
	private String userIdCard = null;
	private Timestamp userCreateDate = null;
	private String isVerify = "0";//是否认证
	private String userTel = null;//电话
	private String copartnerCategory = null;//合伙人类型（资金，技术，推广，运营，其他）
	private String startAbility = null;//创业能力 (资金信息，技术信息，推广信息，运营信息，创业能力)
	private String userField = null;//关注领域 (移动互联网，电子商务，文化艺术，教育体育，汽车，旅游户外，房产，营销广告，硬件，工具软件，企业服务，搜索安全，医疗健康，媒体资讯，生活消费，其他)
	private String introduceVideo = null;//介绍视频
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserNickName() {
		return userNickName;
	}
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserRealName() {
		return userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserIntroduce() {
		return userIntroduce;
	}
	public void setUserIntroduce(String userIntroduce) {
		this.userIntroduce = userIntroduce;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public Timestamp getUserBirthday() {
		return userBirthday;
	}
	public void setUserBirthday(Timestamp userBirthday) {
		this.userBirthday = userBirthday;
	}
	public String getUserPhoto() {
		return userPhoto;
	}
	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}
	public String getUserRealPhoto() {
		return userRealPhoto;
	}
	public void setUserRealPhoto(String userRealPhoto) {
		this.userRealPhoto = userRealPhoto;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserIp() {
		return userIp;
	}
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	public String getUserWeChat() {
		return userWeChat;
	}
	public void setUserWeChat(String userWeChat) {
		this.userWeChat = userWeChat;
	}
	public String getUserIdCard() {
		return userIdCard;
	}
	public void setUserIdCard(String userIdCard) {
		this.userIdCard = userIdCard;
	}
	public Timestamp getUserCreateDate() {
		return userCreateDate;
	}
	public void setUserCreateDate(Timestamp userCreateDate) {
		this.userCreateDate = userCreateDate;
	}
	public String getIsVerify() {
		return isVerify;
	}
	public void setIsVerify(String isVerify) {
		this.isVerify = isVerify;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getCopartnerCategory() {
		return copartnerCategory;
	}
	public void setCopartnerCategory(String copartnerCategory) {
		this.copartnerCategory = copartnerCategory;
	}
	public String getStartAbility() {
		return startAbility;
	}
	public void setStartAbility(String startAbility) {
		this.startAbility = startAbility;
	}
	public String getUserField() {
		return userField;
	}
	public void setUserField(String userField) {
		this.userField = userField;
	}
	public String getIntroduceVideo() {
		return introduceVideo;
	}
	public void setIntroduceVideo(String introduceVideo) {
		this.introduceVideo = introduceVideo;
	}
}

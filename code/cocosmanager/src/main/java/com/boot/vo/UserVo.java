/**
 * 
 */
package com.boot.vo;

/**
 * @author Administrator
 *
 */
public class UserVo {
	private String userId;//用户ID
	private String nickName;//昵称
	private String mobile;//手机
	private String mail;//邮箱
	private String token;
	private String welcomeCode;//邀请码
	private String recommendBy;//推荐人
	private String vipLevel;//VIP等级
	private String totolPayCheck;//充值总金额
	private String userHead;//用户头像
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}
	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}
	/**
	 * @return the welcomeCode
	 */
	public String getWelcomeCode() {
		return welcomeCode;
	}
	/**
	 * @param welcomeCode the welcomeCode to set
	 */
	public void setWelcomeCode(String welcomeCode) {
		this.welcomeCode = welcomeCode;
	}
	/**
	 * @return the recommendBy
	 */
	public String getRecommendBy() {
		return recommendBy;
	}
	/**
	 * @param recommendBy the recommendBy to set
	 */
	public void setRecommendBy(String recommendBy) {
		this.recommendBy = recommendBy;
	}
	/**
	 * @return the vipLevel
	 */
	public String getVipLevel() {
		return vipLevel;
	}
	/**
	 * @param vipLevel the vipLevel to set
	 */
	public void setVipLevel(String vipLevel) {
		this.vipLevel = vipLevel;
	}
	/**
	 * @return the totolPayCheck
	 */
	public String getTotolPayCheck() {
		return totolPayCheck;
	}
	/**
	 * @param totolPayCheck the totolPayCheck to set
	 */
	public void setTotolPayCheck(String totolPayCheck) {
		this.totolPayCheck = totolPayCheck;
	}
	/**
	 * @return the userHead
	 */
	public String getUserHead() {
		return userHead;
	}
	/**
	 * @param userHead the userHead to set
	 */
	public void setUserHead(String userHead) {
		this.userHead = userHead;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserVo [userId=" + userId + ", nickName=" + nickName
				+ ", mobile=" + mobile + ", mail=" + mail + ", token=" + token
				+ ", welcomeCode=" + welcomeCode + ", recommendBy="
				+ recommendBy + ", vipLevel=" + vipLevel + ", totolPayCheck="
				+ totolPayCheck + ", userHead=" + userHead + "]";
	}
	
}

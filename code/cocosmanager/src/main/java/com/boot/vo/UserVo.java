/**
 * 
 */
package com.boot.vo;

/**
 * @author Administrator
 *
 */
public class UserVo {
	private int userId; // 用户ID
	private String userWechatId; // 微信ID
	private String nickName; // 昵称
	private String mobile; // 手机
	private String email; // 邮箱
	private String token; // token
	private String inviteCode; // 邀请码
	private int reference; // 推荐人
	private String vipLv; // VIP等级
	private String totalRecharge; // 充值总金额
	private String imgPath; // 用户头像
	private String createTime; // 创建时间
	private String updateTime; // 更新时间

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserWechatId() {
        return userWechatId;
    }

    public void setUserWechatId(String userWechatId) {
        this.userWechatId = userWechatId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getVipLv() {
        return vipLv;
    }

    public void setVipLv(String vipLv) {
        this.vipLv = vipLv;
    }

    public String getTotalRecharge() {
        return totalRecharge;
    }

    public void setTotalRecharge(String totalRecharge) {
        this.totalRecharge = totalRecharge;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "userId='" + userId + '\'' +
                ", userWechatId='" + userWechatId + '\'' +
                ", nickName='" + nickName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", token='" + token + '\'' +
                ", inviteCode='" + inviteCode + '\'' +
                ", reference='" + reference + '\'' +
                ", vipLv='" + vipLv + '\'' +
                ", totalRecharge='" + totalRecharge + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}

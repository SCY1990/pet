/**
 * 
 */
package com.boot.vo;

/**
 * @author Administrator
 *
 */
public class UserResourceVo {
    private int id; // id
	private int userId; // 用户ID
	private int diceNum; // 骰子次数
	private int fatigueNum; // 疲劳值
	private int gold; // 金币
	private int diamond; // 钻石
	private String diceResetTime; // 骰子重置时间
	private String fatigueResetTime; // 疲劳重置时间
	private int diceMaxNum; // 骰子上限
	private int fatigueMaxNum; // 疲劳上限
	private String goldAddition; // 金币加成
	private String diamondAddition; // 钻石加成
	private int continousLoginDays; // 连续登录天数
	private String updateTime; // 更新时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDiceNum() {
        return diceNum;
    }

    public void setDiceNum(int diceNum) {
        this.diceNum = diceNum;
    }

    public int getFatigueNum() {
        return fatigueNum;
    }

    public void setFatigueNum(int fatigueNum) {
        this.fatigueNum = fatigueNum;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getDiamond() {
        return diamond;
    }

    public void setDiamond(int diamond) {
        this.diamond = diamond;
    }

    public String getDiceResetTime() {
        return diceResetTime;
    }

    public void setDiceResetTime(String diceResetTime) {
        this.diceResetTime = diceResetTime;
    }

    public String getFatigueResetTime() {
        return fatigueResetTime;
    }

    public void setFatigueResetTime(String fatigueResetTime) {
        this.fatigueResetTime = fatigueResetTime;
    }

    public int getDiceMaxNum() {
        return diceMaxNum;
    }

    public void setDiceMaxNum(int diceMaxNum) {
        this.diceMaxNum = diceMaxNum;
    }

    public int getFatigueMaxNum() {
        return fatigueMaxNum;
    }

    public void setFatigueMaxNum(int fatigueMaxNum) {
        this.fatigueMaxNum = fatigueMaxNum;
    }

    public String getGoldAddition() {
        return goldAddition;
    }

    public void setGoldAddition(String goldAddition) {
        this.goldAddition = goldAddition;
    }

    public String getDiamondAddition() {
        return diamondAddition;
    }

    public void setDiamondAddition(String diamondAddition) {
        this.diamondAddition = diamondAddition;
    }

    public int getContinousLoginDays() {
        return continousLoginDays;
    }

    public void setContinousLoginDays(int continousLoginDays) {
        this.continousLoginDays = continousLoginDays;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "UserResourceVo{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", diceNum='" + diceNum + '\'' +
                ", fatigueNum='" + fatigueNum + '\'' +
                ", gold='" + gold + '\'' +
                ", diamond='" + diamond + '\'' +
                ", diceResetTime='" + diceResetTime + '\'' +
                ", fatigueResetTime='" + fatigueResetTime + '\'' +
                ", diceMaxNum='" + diceMaxNum + '\'' +
                ", fatigueMaxNum='" + fatigueMaxNum + '\'' +
                ", goldAddition='" + goldAddition + '\'' +
                ", diamondAddition='" + diamondAddition + '\'' +
                ", continousLoginDays='" + continousLoginDays + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}

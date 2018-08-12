/**
 * 
 */
package com.boot.vo;

/**
 * @author Administrator
 *
 */
public class ParamVo {
	private String id;//用户ID
	private String diceDefaultNum; //投掷骰子次数
	private String diceRecoverTime; //骰子恢复时间
	private String diceMaxValue; //骰子最大数字
	private String diceMinValue; //骰子最小数字
	private String perStepGold; //每步获得金币
	private String perStepExp; //每步获得经验
	private String plunderGold; //掠夺金币
	private String fatigueMaxNum; //宠物疲劳上限
	private String fatigueRecoverTime; //疲劳恢复速度
	private String friendsMaxNum; //好友上限
	private String resetTime;// 每日重置时间点
	private String matchRange;// 匹配等级范围

	public String getId() {
		return id;
	}

	public String getDiceDefaultNum() {
		return diceDefaultNum;
	}

	public String getDiceRecoverTime() {
		return diceRecoverTime;
	}

	public String getDiceMaxValue() {
		return diceMaxValue;
	}

	public String getDiceMinValue() {
		return diceMinValue;
	}

	public String getPerStepGold() {
		return perStepGold;
	}

	public String getPerStepExp() {
		return perStepExp;
	}

	public String getPlunderGold() {
		return plunderGold;
	}

	public String getFatigueMaxNum() {
		return fatigueMaxNum;
	}

	public String getFatigueRecoverTime() {
		return fatigueRecoverTime;
	}

	public String getFriendsMaxNum() {
		return friendsMaxNum;
	}

	public String getResetTime() {
		return resetTime;
	}

	public String getMatchRange() {
		return matchRange;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDiceDefaultNum(String diceDefaultNum) {
		this.diceDefaultNum = diceDefaultNum;
	}

	public void setDiceRecoverTime(String diceRecoverTime) {
		this.diceRecoverTime = diceRecoverTime;
	}

	public void setDiceMaxValue(String diceMaxValue) {
		this.diceMaxValue = diceMaxValue;
	}

	public void setDiceMinValue(String diceMinValue) {
		this.diceMinValue = diceMinValue;
	}

	public void setPerStepGold(String perStepGold) {
		this.perStepGold = perStepGold;
	}

	public void setPerStepExp(String perStepExp) {
		this.perStepExp = perStepExp;
	}

	public void setPlunderGold(String plunderGold) {
		this.plunderGold = plunderGold;
	}

	public void setFatigueMaxNum(String fatigueMaxNum) {
		this.fatigueMaxNum = fatigueMaxNum;
	}

	public void setFatigueRecoverTime(String fatigueRecoverTime) {
		this.fatigueRecoverTime = fatigueRecoverTime;
	}

	public void setFriendsMaxNum(String friendsMaxNum) {
		this.friendsMaxNum = friendsMaxNum;
	}

	public void setResetTime(String resetTime) {
		this.resetTime = resetTime;
	}

	public void setMatchRange(String matchRange) {
		this.matchRange = matchRange;
	}

	@Override
	public String toString() {
		return "ParamVo{" +
				"id='" + id + '\'' +
				", diceDefaultNum='" + diceDefaultNum + '\'' +
				", diceRecoverTime='" + diceRecoverTime + '\'' +
				", diceMaxValue='" + diceMaxValue + '\'' +
				", diceMinValue='" + diceMinValue + '\'' +
				", perStepGold='" + perStepGold + '\'' +
				", perStepExp='" + perStepExp + '\'' +
				", plunderGold='" + plunderGold + '\'' +
				", fatigueMaxNum='" + fatigueMaxNum + '\'' +
				", fatigueRecoverTime='" + fatigueRecoverTime + '\'' +
				", friendsMaxNum='" + friendsMaxNum + '\'' +
				", resetTime='" + resetTime + '\'' +
				", matchRange='" + matchRange + '\'' +
				'}';
	}
}

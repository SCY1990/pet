/**
 * 
 */
package com.boot.vo;

/**
 * @author Administrator
 *
 */
public class ParamVo {
	private int id;//用户ID
	private int diceDefaultNum; //投掷骰子次数
	private String diceRecoverTime; //骰子恢复时间
	private int diceMaxValue; //骰子最大数字
	private int diceMinValue; //骰子最小数字
	private int perStepGold; //每步获得金币
	private int perStepExp; //每步获得经验
	private String plunderGold; //掠夺金币
	private int fatigueMaxNum; //宠物疲劳上限
	private String fatigueRecoverTime; //疲劳恢复速度
	private int friendsMaxNum; //好友上限
	private String resetTime;// 每日重置时间点
	private int matchRange;// 匹配等级范围

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDiceDefaultNum() {
		return diceDefaultNum;
	}

	public void setDiceDefaultNum(int diceDefaultNum) {
		this.diceDefaultNum = diceDefaultNum;
	}

	public String getDiceRecoverTime() {
		return diceRecoverTime;
	}

	public void setDiceRecoverTime(String diceRecoverTime) {
		this.diceRecoverTime = diceRecoverTime;
	}

	public int getDiceMaxValue() {
		return diceMaxValue;
	}

	public void setDiceMaxValue(int diceMaxValue) {
		this.diceMaxValue = diceMaxValue;
	}

	public int getDiceMinValue() {
		return diceMinValue;
	}

	public void setDiceMinValue(int diceMinValue) {
		this.diceMinValue = diceMinValue;
	}

	public int getPerStepGold() {
		return perStepGold;
	}

	public void setPerStepGold(int perStepGold) {
		this.perStepGold = perStepGold;
	}

	public int getPerStepExp() {
		return perStepExp;
	}

	public void setPerStepExp(int perStepExp) {
		this.perStepExp = perStepExp;
	}

	public String getPlunderGold() {
		return plunderGold;
	}

	public void setPlunderGold(String plunderGold) {
		this.plunderGold = plunderGold;
	}

	public int getFatigueMaxNum() {
		return fatigueMaxNum;
	}

	public void setFatigueMaxNum(int fatigueMaxNum) {
		this.fatigueMaxNum = fatigueMaxNum;
	}

	public String getFatigueRecoverTime() {
		return fatigueRecoverTime;
	}

	public void setFatigueRecoverTime(String fatigueRecoverTime) {
		this.fatigueRecoverTime = fatigueRecoverTime;
	}

	public int getFriendsMaxNum() {
		return friendsMaxNum;
	}

	public void setFriendsMaxNum(int friendsMaxNum) {
		this.friendsMaxNum = friendsMaxNum;
	}

	public String getResetTime() {
		return resetTime;
	}

	public void setResetTime(String resetTime) {
		this.resetTime = resetTime;
	}

	public int getMatchRange() {
		return matchRange;
	}

	public void setMatchRange(int matchRange) {
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

/**
 * 
 */
package com.boot.vo;

/**
 * @author Administrator
 *
 */
public class PlotChanceVo {
	private int id;// id
	private String chanceNum; // 效果编号
	private String chanceDetail; // 效果
	private String iconPath; // 对应icon
	private String awardMin; // 奖励数值最小
	private String awardMax; // 奖励数值最大

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChanceNum() {
		return chanceNum;
	}

	public void setChanceNum(String chanceNum) {
		this.chanceNum = chanceNum;
	}

	public String getChanceDetail() {
		return chanceDetail;
	}

	public void setChanceDetail(String chanceDetail) {
		this.chanceDetail = chanceDetail;
	}

	public String getIconPath() {
		return iconPath;
	}

	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}

	public String getAwardMin() {
		return awardMin;
	}

	public void setAwardMin(String awardMin) {
		this.awardMin = awardMin;
	}

	public String getAwardMax() {
		return awardMax;
	}

	public void setAwardMax(String awardMax) {
		this.awardMax = awardMax;
	}

	@Override
	public String toString() {
		return "PlotChanceVo{" +
				"id=" + id +
				", chanceNum='" + chanceNum + '\'' +
				", chanceDetail='" + chanceDetail + '\'' +
				", iconPath='" + iconPath + '\'' +
				", awardMin='" + awardMin + '\'' +
				", awardMax='" + awardMax + '\'' +
				'}';
	}
}

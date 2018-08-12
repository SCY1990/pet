/**
 * 
 */
package com.boot.vo;

/**
 * @author Administrator
 *
 */
public class PlotVo {
	private int id;// id
	private String plotName; // 地块名称
	private String plotType; // 地块类型
	private String iconPath; // 对应icon
	private String awardMin; // 奖励数值最小
	private String awardMax; // 奖励数值最大

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlotName() {
		return plotName;
	}

	public void setPlotName(String plotName) {
		this.plotName = plotName;
	}

	public String getPlotType() {
		return plotType;
	}

	public void setPlotType(String plotType) {
		this.plotType = plotType;
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
		return "PlotVo{" +
				"id=" + id +
				", plotName='" + plotName + '\'' +
				", plotType='" + plotType + '\'' +
				", iconPath='" + iconPath + '\'' +
				", awardMin='" + awardMin + '\'' +
				", awardMax='" + awardMax + '\'' +
				'}';
	}
}

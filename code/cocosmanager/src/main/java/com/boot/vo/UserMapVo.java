/**
 * 
 */
package com.boot.vo;

/**
 * @author Administrator
 *
 */
public class UserMapVo {
	private int id;// id
	private int userId; // 用户Id
	private int mapId; // 地图Id
	private int mapPlotId; // 地块顺序
	private int circleNum; // 圈数
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

	public int getMapId() {
		return mapId;
	}

	public void setMapId(int mapId) {
		this.mapId = mapId;
	}

	public int getMapPlotId() {
		return mapPlotId;
	}

	public void setMapPlotId(int mapPlotId) {
		this.mapPlotId = mapPlotId;
	}

	public int getCircleNum() {
		return circleNum;
	}

	public void setCircleNum(int circleNum) {
		this.circleNum = circleNum;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "UserMapVo{" +
				"id=" + id +
				", userId=" + userId +
				", mapId=" + mapId +
				", mapPlotId=" + mapPlotId +
				", circleNum=" + circleNum +
				", updateTime='" + updateTime + '\'' +
				'}';
	}
}

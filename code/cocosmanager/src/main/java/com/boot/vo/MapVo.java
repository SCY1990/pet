/**
 * 
 */
package com.boot.vo;

/**
 * @author Administrator
 *
 */
public class MapVo {
	private int id;// id
	private int mapId; // 地图Id
	private int mapPlotId; // 地块顺序
	private String plotType; // 地块类型
	private String plotName; // 地块名称

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPlotType() {
		return plotType;
	}

	public void setPlotType(String plotType) {
		this.plotType = plotType;
	}

	public String getPlotName() {
		return plotName;
	}

	public void setPlotName(String plotName) {
		this.plotName = plotName;
	}

	@Override
	public String toString() {
		return "MapVo{" +
				"id=" + id +
				", mapId=" + mapId +
				", mapPlotId=" + mapPlotId +
				", plotType='" + plotType + '\'' +
				", plotName='" + plotName + '\'' +
				'}';
	}
}

package com.bridgelab.model;

import java.util.Map;

public class MapBean {
	private Map<String ,Integer> mapProperties;

	@Override
	public String toString() {
		return "MapBean [mapProperties=" + mapProperties + "]";
	}

	public Map<String, Integer> getMapProperties() {
		return mapProperties;
	}

	public void setMapProperties(Map<String, Integer> mapProperties) {
		this.mapProperties = mapProperties;
	}

}

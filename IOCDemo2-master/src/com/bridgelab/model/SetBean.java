package com.bridgelab.model;

import java.util.Set;

public class SetBean {
	private Set<Integer> setProperties;

	public Set<Integer> getSetProperties() {
		return setProperties;
	}

	public void setSetProperties(Set<Integer> setProperties) {
		this.setProperties = setProperties;
	}
	@Override
	public String toString() {
		return "SetBean [setProperties=" + setProperties + "]";
	}
}

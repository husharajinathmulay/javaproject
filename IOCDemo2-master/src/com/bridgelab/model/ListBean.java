package com.bridgelab.model;

import java.util.List;

public class ListBean 
{
  private List<Integer> listProperties;

public List<Integer> getListProperties() {
	return listProperties;
}

public void setListProperties(List<Integer> listProperties) {
	this.listProperties = listProperties;
}

@Override
public String toString() {
	return "ListBean [listProperties=" + listProperties + "]";
}

}

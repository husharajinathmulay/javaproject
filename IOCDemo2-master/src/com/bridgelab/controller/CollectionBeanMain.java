package com.bridgelab.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelab.model.ListBean;
import com.bridgelab.model.MapBean;
import com.bridgelab.model.SetBean;

public class CollectionBeanMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("CollectionBeans.xml");
		ListBean list = context.getBean("listBean", ListBean.class);
		System.out.println(list.getListProperties());

		MapBean map = context.getBean("mapBean", MapBean.class);
		System.out.println(map.getMapProperties());

		SetBean set = context.getBean("setBean", SetBean.class);
		System.out.println(set.getSetProperties());
		context.close();

	}
}

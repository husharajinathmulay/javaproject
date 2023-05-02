package com.bridgelab.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bridgelab.model.ATMConfig;
import com.bridgelab.model.Transaction;

public class AOPMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ATMConfig.class);
		Transaction transaction = context.getBean(Transaction.class);
		transaction.transactionStart();
		context.close();
	}
}

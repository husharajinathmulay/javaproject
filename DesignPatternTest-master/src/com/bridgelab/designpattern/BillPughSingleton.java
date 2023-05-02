package com.bridgelab.designpattern;
public class BillPughSingleton {

    private BillPughSingleton(){}
    
    private static class SingletonHelper
    {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance()
    {       System.out.println("BillPughSingleton");
        return SingletonHelper.INSTANCE;
    }
}
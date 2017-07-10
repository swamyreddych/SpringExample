package com.service;

public class CustomerServiceImpl implements CustomerService {

	public void addCustomer() {
		System.out.println("addCustomer() in Target Object");
	}

	public String addCustomerReturnValue() {
       System.out.println("addCustomerReturnValue() in Target Object");
		
		return "AOP Example";
	}

	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is in Target Object");
		throw new Exception("Generic Error");
	}

	public void addCustomerAround(String name) {
		System.out.println("addCustomerAround() is in Target Object: "+name);
		
	}

}

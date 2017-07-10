package com.service;

public interface CustomerService {
	
	public void addCustomer();
	
	public String addCustomerReturnValue();
	
	public void addCustomerThrowException() throws Exception;
	
	public void addCustomerAround(String name);

}

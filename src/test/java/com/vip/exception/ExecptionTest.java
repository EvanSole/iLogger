package com.vip.exception;


public class ExecptionTest {

	
	public static void main(String[] args) {
		try{
			int a = 1/0;
			System.out.println(a);
		}catch(Exception e){
		   throw ExceptionFactory.createException(new BusinessException("delete.data",new String[]{"AAA"}));
		}
	}
	
	
}

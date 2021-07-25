package com.jizhong.test;

public class TestException {
	public static void aMethod() throws Exception{
		throw new Exception("信息~~~");
	}
	
	//static：静态的
	public static void main(String[] args) {
		try{
			aMethod();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("你好 异常~~");
		}
	}
}

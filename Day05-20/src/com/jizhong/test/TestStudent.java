package com.jizhong.test;

import com.jizhong.pojo.Student;

public class TestStudent {
	
	public static void main(String[] args) {
		Student student = new Student();
		student.setAge(-100);
		try{
			
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}

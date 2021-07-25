package com.jizhong.pojo;

public class Student {
	private int age;
	
	public int getAge(){
		return age;
	}
	
	
	//throws：声明异常，提示调用者
	public void setAge(int age) {//-100
		if(age > 0){
			this.age = age;
		}else{
			//RuntimeException：运行时异常
			//throw：抛出
			throw new IllegalArgumentException("年龄不能输入负数~~~");
		}
	}
}

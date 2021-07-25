package com.jizhong.pojo;

public class PackageClass {
	public static void main(String[] args) {
		//包装类：把基本数据类型的数据封装到一个类中，并且该类中还会提供其他方便数据类型的操作方法
		Integer i = new Integer(10);
		int i2 = 10;
		System.out.println(i.MIN_VALUE);
		System.out.println(i.MAX_VALUE);
		System.out.println(i.compareTo(9));//两个数字比较 如果i大于9则返回1，反之返回0
		//Integer.compareTo()：比较两个数字大小
		if (i.compareTo(1) == 1) {
			System.out.println(i + "大于" + 9);
		}else{
			System.out.println(i + "小于" + 9);
		}
		//Integer.equals()：判断两个数字是否相等
		if (i.equals(10)) {//true
			System.out.println("相等");
		}else{//false
			System.out.println("不相等");
		}
		
		//Integer.intValue()：将包装类转换为基本数据类型
		int i3 = i.intValue();
		System.out.println(i.intValue());
		
		
		//Integer.parseInt()：将字符串转换为整数
		int str = Integer.parseInt("123456789");
		System.out.println(str);
		
		//Integer.toString()：将整数对象转换为字符串对象
		String str2 = i.toString();
		System.out.println(str2);
		
		
		
		//valueOf()：将基本数据类型转换为包装类
		Integer i5 = Integer.valueOf(100);
		System.out.println(i5);
		
		//Integer.toBinaryString()：将十进制数字转换为二进制
		System.out.println(Integer.toBinaryString(10));
		//Integer.toHexString()：将十进制转换为16进制
		System.out.println(Integer.toHexString(10));//a
		//Integer.toOctalString()：将十进制转换为8进制
		System.out.println(Integer.toOctalString(10));
		
		
		//拆箱和装箱
		//装箱：将基本数据类型转换为包装类
		Integer i9 = new Integer(10);//构造方法
		Integer.valueOf(10);//静态方法
		//拆箱：将包装类转换为基本数据类型
		i9.intValue();//普通方法
		
		
		//自动装箱
		Integer i6 = 10;
		Integer i7 = 10;
		//整数类型包装类只有在-128 ~ 127之间自动装箱指向的内存地址值才是一样的
		if(i6 == i7){//内存地址值
			System.out.println("两个对象相等");
		}else{
			System.out.println("两个对象不相等");
		}
		
		//没有用到自动装箱
		//new关键字在创建对象的时候，会开辟一块新的空间
		Integer i10 = new Integer(10);//0x666
		Integer i11 = new Integer(10);//0x999
		if(i10 == i11){//两个对象不相等
			System.out.println("两个对象相等");
		}else{
			System.out.println("两个对象不相等");
		}
		
	}
}

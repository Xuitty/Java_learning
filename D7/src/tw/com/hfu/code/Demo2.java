/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;

import org.junit.jupiter.api.Test;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Demo2 {
	
	public static final Double PI=3.14159;  //常數必須要是公開、靜態、final(程式執行時不能被改)，且放在方法外
	private Integer id; //default==null
	private int num;  //default==0
	
	@Test
	public void test1() {
		int age=20;
		Integer num1;  //方法內變數還是要先初始化，不會給null
		num1=20;
		System.out.println(id);  //null
		System.out.println(num);  //0
		System.out.println(age);
		System.out.println(num1);
		
	}
}

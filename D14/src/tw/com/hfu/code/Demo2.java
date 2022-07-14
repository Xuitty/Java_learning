/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;

import java.beans.JavaBean;
import java.util.Date;

import org.junit.jupiter.api.Test;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		main(args);  //main 法法會造迴圈錯誤
		
	}
	@Test
	public void test() {
		
	}
	
	@Test
	public void test2() {  //java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10  超出索引邊界值
		int i[]=new int[10];
		System.out.println(i[10]);
		
	}
	
	@Test
	public void test3() {  //java.lang.ArithmeticException: / by zero  數學的錯誤:不能除以0
		int i=10/0;
		System.out.println(i);
		
	}
	
	@Test
	public void test4() {  //java.lang.ClassCastException  類別轉換錯誤
		Object obj=new Date();
		String str=(String)obj;
		
	}
	
	@Test
	public void test5() {  //java.lang.NullPointerException  指標不存在
		Person p=new Person();
		p=null;
		System.out.println(p.toString());
		
	}

}

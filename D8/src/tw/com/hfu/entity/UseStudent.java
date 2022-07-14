/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.entity;

import org.junit.jupiter.api.Test;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class UseStudent {
	
	public void method() {
		Student s=new Student();
		StudentUtils su=new StudentUtils();
		
		String a=su.checkIdAndPass(0, "123456");
		System.out.println(a);
	}
	@Test
	public void method2(){
		StudentUtils su=new StudentUtils();
		System.out.println(su.checkIdAndPass(0, "123456")); 
		
		
	}
}

/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.controller;

import tw.com.hfu.entity.Employee;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ep1=new Employee();
		ep1.setEid(0);
		ep1.seteNumerId("0");
		ep1.seteNumberName("ABC");
		ep1.seteNumberAge(1);
		ep1.seteNumberEmail("123");
		
		System.out.println(ep1.toString());
	}

}

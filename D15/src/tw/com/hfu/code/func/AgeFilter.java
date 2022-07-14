/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code.func;

import tw.com.hfu.code.entity.Employee;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class AgeFilter implements MyEmp<Employee> {

	@Override
	public boolean test(Employee t) {
		// TODO Auto-generated method stub
		return t.getAge()<50;
	}

	
	
}

/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Student extends MyFuClass {

	@Override
	public void getEat() {
		System.out.println("rice");

	}
	@Override
	public void getSleep() {

	}
	
	public void getFuMethod() {
		super.getFood();
	}

}

/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.extends1;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Student extends FuClass {

	
	
	@Override  //覆寫父類別的內容
	public void sleep() {
		// TODO Auto-generated method stub
		//super.sleep();
		System.out.println("sub sleep");
	}

	public void read() {

		System.out.println("read");
	}
}

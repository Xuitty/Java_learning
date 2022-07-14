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
public class Worker extends FuClass {

	
	
	@Override  //覆寫父類別的內容
	public void eat() {
		// TODO Auto-generated method stub
		//super.eat();
		System.out.println("sub eat");
	}

	public void work() {

		System.out.println("work");
	}

}

/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.method;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class MethodDemo1 {

	public void method1() {
		
		int x=10,y=20,z=30,x1=40;
		System.out.println(x+y+z+x1);
	}

	public void method1(int x) {
		
		int y=20,z=30,x1=40;
		System.out.println(x+y+z+x1);
		
	}

	public void method1(int x, int y) {
		int z=30,x1=40;
		System.out.println(x+y+z+x1);
	}

	public void method1(int x, int y, int z) {
		int x1=40;
		System.out.println(x+y+z+x1);
	}
}

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
public class Demo4 {
	
	public static final String hfu="https://www.hfu.edu.tw";
	public static String a="1234";  //不加final就可以被改變
	@Test
	public void main() {
		getWeb();
	}
	
	public static void getWeb() {
		System.out.println(hfu);
		System.out.println(a);
	}
	public void none() {
		System.out.println("none");
	}
}

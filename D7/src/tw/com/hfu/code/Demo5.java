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
public class Demo5 {
	@Test
	public void getHfu() {
		/*
		 * 只限用於static方法跟屬性
		 * 格式class.static-method
		 * */
		System.out.println(Demo4.hfu);  //static屬性
		Demo4.a="12345";
		System.out.println(Demo4.a);
		Demo4.getWeb(); //static方法
	}
	@Test
	public void getHfu2() {
		/*
		 * 
		 * 建立一個名為d4的實體，此方法適用static方法及一般方法
		 * 
		 * */
		Demo4 d4=new Demo4();
		d4.getWeb();  //static方法
		d4.none();  //一般方法
	}
}

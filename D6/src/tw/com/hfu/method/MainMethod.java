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
public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo1 md1=new MethodDemo1();
		MethodDemo2 md2=new MethodDemo2();
		md1.method1();
		md1.method1(5);
		md1.method1(7, 9);
		md1.method1(11, 13, 15);
	
		md2.method1(5, "hello", (byte)127);  //多載方法時，方法名稱可以相同，但方法的參數或是參數的資料型態要不同，若都相同，擺放的位置必須不同
		md2.method1('P');
	}

}

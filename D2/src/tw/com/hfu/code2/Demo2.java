/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code2;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Demo2 {

	public static void main(String[] args) {
		method1();

		method2();

	}

	public static void method2() {
		byte c = 120, d = 10;// byte與short超過上限會跑到負數0~1~127~-128~-1~0
		byte e = (byte) (c + d); //byte的運算必須先轉換成byte型態，不然預設會跑int
		System.out.println(e);
	}

	public static void method1() {

		byte x = 1, y = 2, z = 3;  //沒有使用的變數會跳黃色警告
		boolean b = true;
		System.out.println(x);
		System.out.println(y);
		System.out.println(999999999);
		System.out.println(b);

		byte a = (byte) (x + y);
		System.out.println(a);
		
		short f=10,i=60;
		short j=(short)(f+i);  //short的運算也必須先轉換成short型態，不然預設會跑int
		System.out.println(j);
	}

}

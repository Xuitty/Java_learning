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
public class Demo2 {

	public static void main(String[] args) {
		int a = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				a += i;
			}
		}
		System.out.println(a);
	}

	public static void method3() {
		int i = 0;
		do {
			System.out.println("123  " + i);
			i--;
		} while (i > -100);
	}

	public static void method2() {
		int i = 0;
		while (i > -100) {
			System.out.println("123  " + i);
			i--;
		}
		// System.out.println(i); //while函式則無此問題
	}

	public static void method1() {
		for (int i = 0; i > -100; i--) {
			System.out.println("123  " + i);
		}
		// System.out.println(i); //若在for函式內宣告條件變數，其變數在迴圈結束後變會棄用
	}

}

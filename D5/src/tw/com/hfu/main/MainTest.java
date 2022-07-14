/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.main;

//import tw.com.hfu.code.*;//  全導
import tw.com.hfu.code.Demo1;
import tw.com.hfu.code.Demo2;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class MainTest {

	public static void main(String[] args) {
		Demo1 d1 = new Demo1(); // 建立實體物件 其中Demo1代表在stack區的記憶體位置，new
								// Demo1()代表在heap區分割出一塊名為Demo01()的資料，d1為連結兩個區域的通道
		d1.method1(); // 用d1指向在heap區的Demo1()中的method1函數

		d1.method2(20);

		int x = d1.method3();
		System.out.println(x);
		// System.out.println(d1.method3()); //跟上面一樣
		boolean y = d1.method3_1();
		System.out.println(y);
		// System.out.println(d1.method3_1()); //跟上面一樣
		// Demo2 d2=new Demo2();
		// d2.method1();
		System.out.println(d1.method3()+d1.method3_2());
		
		d1.method5('P',1,2,3,4,5,6,7,8,9,10);
	}

}

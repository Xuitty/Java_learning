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
public class Demo3 {
	public static void main(String[] args) { //main預設傳入傳出string[] (記憶體位置)
		int x=10,y=50;
		System.out.println(x+y);
		
		long a=123L,b=877L;  //LONG型態後面要加L才是真的LONG型態
		System.out.println(a+b);
		
		int c=90;
		long d=90L;
		d=c;  //long(8bytes)可以轉換成int(4bytes)
		c=d;  //int(4bytes)不能轉換成long(8bytes)
		c=(int)d;  //強制轉換原本的long可能會遺失資料
		
	}
	
	
}

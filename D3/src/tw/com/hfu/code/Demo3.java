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
public class Demo3 {
	public static void main(String[] args) {
		
		int a=101;
		float b=105.32f;
		long c=100L;
		double d=100.00;
		
		b=a;  //資料型態大小相同情況下，有小數點的可以變成沒有小數點的
		a=(int)b;  //反之，有小數點的不能轉換成沒有小數點的，若需強制轉換需用(資料型態)
		d=c;
		c=(long)d;
		System.out.println(a);
		
	}
}

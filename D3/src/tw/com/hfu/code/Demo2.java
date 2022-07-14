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
		// TODO Auto-generated method stub
		double x=1.1234567899876,y=1.1234567899876,z=x+y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.printf("%.2f",z); //若須指定小數後幾位，可用%.xf去指定位數
		//JAVA double型態不用%lf，用%f即可
	}

}

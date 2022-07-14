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
		int x[][] = { 
				{ 1, 2, 3, 4, 5, 6, 7, 8 }, 
				{ 10, 20, 30, 40, 50 }, 
				{ -1, -2, -3, -4, -5, -6 }
				};
			for(int i=0;i<x.length;i++) {
				for(int j=0;j<x[i].length;j++) {
					
					if(j==x[i].length-1) {  //-1的作用為讓長度變成最後一個的索引值
						System.out.print(x[i][j]+"]");  //最後一個值
					}else if(j==0){
						System.out.print("["+x[i][j]+",");  //頭一個值
					}else {
						System.out.print(x[i][j]+",");  //中間所有值
					}	//System.out.print(j==0?"[":+x[i][j]+(j==x[i].length-1?"]":","));
				}
				System.out.println("");
			}
			System.out.println(x.length);
	}

	public static void method4() {
		int a = 0;
		int[] x = { 2, 4, 6, 8, 10, 12, 14, 16 };
		// int[] y= new int[]
		for (int i = 0; i < x.length; i++) {
			if (x[i] == 8) {
				// break; //break跳出迴圈
				continue; // continue將回到迴圈繼續運算
			} else {
				a += x[i];
			}
		}
		System.out.println(a);
	}

	public static void method3() {
		int x[] = { 5, 123, 534, 123, 444 }; // 最常用
		myprint(x);
	}

	public static void method2() { // 次少用
		int x[] = new int[] { 5, 123, 534, 123, 555 };
		myprint(x);
	}

	public static void method1() { // 最少用
		int x[] = new int[4]; // new代表建立新物件 建立一個大小為4的array，其中值為0~3
		x[0] = 5;
		x[1] = 8;
		x[3] = 17;

		myprint(x);
	}

	public static void myprint(int[] x) {
		System.out.println("==============for==============");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		System.out.println("==============for each==============");
		for (int y : x) {
			System.out.println(y);
		}
		int i = 0;
		System.out.println("==============while==============");
		while (i < x.length) {
			System.out.println(x[i]);
			i++;
		}
		int o = 0;
		System.out.println("==============do while==============");
		do {
			System.out.println(x[o]);
			o++;
		} while (o < x.length);
	}
}

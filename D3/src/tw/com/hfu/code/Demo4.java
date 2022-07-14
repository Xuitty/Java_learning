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
public class Demo4 {
	public static void main() {
		System.out.println(50>20?"1":"2");  //三元不等式
		System.out.println(50>12?30>10?"1":"2":"3");
		//三元不等式中可以再運算其他條件，此範例順序為先比較50>12 如果TRUE，則繼續比較30>10，如果FALSE，結果為3;30>10如果TRUE，結果為1，如果為FLASE，結果為2
		 x=123;
	}

	public static void method4() {
		int age=20;
		if(age>=0&&age<18) {
			System.out.println("child");
		}else if(age>=18&&age<41){
			System.out.println("junior-adult");
		}else if(age>=41&&age<66){
			System.out.println("senior-adult");
		}else if(age>=66){
			System.out.println("retired");
		}else {
			System.out.println("Input Error");
		}
	}

	public static void method3() {
		if (19 > 15 && (1 == 1 && 5 >= 4)) { // if內的條件式可以以括號區隔比較順序
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println("123");
	}

	public static void method2() {
		int a = 5, b = 10, c = 54;
		System.out.println("====and====");
		System.out.println(a < b && b > c);
		System.out.println(b == c && a <= c);
		System.out.println(c >= b && b > a);
		System.out.println(b <= a && c > a);
		System.out.println("====or====");
		System.out.println(a < b || b > c);
		System.out.println(b == c || a == c);
		System.out.println(c >= b || b > a);
		System.out.println(b <= a || c > a);
	}

	public static void method1() {
		boolean A1 = true;
		boolean A2 = false;
		boolean B1 = true;
		boolean B2 = false;
		// 比較& &&與| ||的不同 &及|前後都會做比較 &&及||若第一個是FALSE，則結果為FALSE
		System.out.println("====and====");
		System.out.println(A1 & B1);
		System.out.println(A1 & B2);
		System.out.println(A2 & B1);
		System.out.println(A2 & B2);
		System.out.println("====or====");
		System.out.println(A1 | B1);
		System.out.println(A1 | B2);
		System.out.println(A2 | B1);
		System.out.println(A2 | B2);
		System.out.println("====andand====");
		System.out.println(A1 && B1);
		System.out.println(A1 && B2);
		System.out.println(A2 && B1);
		System.out.println(A2 && B2);
		System.out.println("====oror====");
		System.out.println(A1 || B1);
		System.out.println(A1 || B2);
		System.out.println(A2 || B1);
		System.out.println(A2 || B2);
		System.out.println("====xor====");
		System.out.println(A1 ^ B1); // XOR運算，兩者相同結果為FLASE，兩者不同結果為TRUE
		System.out.println(A1 ^ B2);
		System.out.println(A2 ^ B1);
		System.out.println(A2 ^ B2);
		System.out.println("====nxor====");
		System.out.println(!(A1 ^ B1));
		System.out.println(!(A1 ^ B2));
		System.out.println(!(A2 ^ B1));
		System.out.println(!(A2 ^ B2));
	}

	public static void method() {
		int a = 10, b = 20;
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);

		System.out.println(10 == 10);
		System.out.println(10 != 10);
		System.out.println(!(10 == 10));
		System.out.println(!(10 != 10));
	}
}

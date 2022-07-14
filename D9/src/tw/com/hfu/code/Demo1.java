/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;

/**
 *private=>外部:X  內部:O
 *static=>外部:X  內部:O
 *final=>外部:O  內部:O
 *constructor=>外部:O  內部:O
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Demo1 {
	
	private Inner inr;  //將內部型態用屬性方式呼叫
	
	public void method() {
		
		inr=new Inner();
	}
	
	/*private Inner inr=new Inner();
	
	public void method() {
		inr.method();
	}*/
	
	private static final class Inner { // 內部類別(私有化)
		public Inner(){
			method1();
			method2();
			method3();
		}
		public void method1() {
			System.out.println("12345");
		}
		public void method2() {
			System.out.println("45678");
		}
		public void method3() {
			System.out.println("2468");
		}
	
	}

}

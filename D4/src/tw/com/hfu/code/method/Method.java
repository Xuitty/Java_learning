/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code.method;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 *方法可分為靜態(static)與動態*empty*
 *
 *方法的形式有六種
 *1.無傳入，無回傳
 *2.有傳入，無回傳
 *3.無傳入，有回傳
 *4.有傳入，有回傳
 *5.JAVA BOOLEAN
 *6.可變函數
 *
 *
 */
public class Method {
	
	public void getMethodDemo() {
		return;  //即使無回傳，正確來說最後還是要加一個return
	}
	static int x=10; //屬性(全域變數)
	
	
	public void demo01() {  //無傳入，無回傳
		System.out.println("print"); //1.一般列印
		int a=10;  //2.內部運算
		int b=20;
		System.out.println(a+b);
		System.out.println(a+b+x); //3.加上屬性進行運算
		
	}

	public void demo02(int a,int b) {  //有傳入(可以多個，傳入Array，傳一個class)，無回傳
		if(a==0&&b==0) {               //可以用作基本判斷輸入的值有沒有符合需求或下去做運算
			System.out.println("請輸入大於0的值");
		}else {
			System.out.println(a+b);
		}
	}

	public int demo03() {  //無傳入，有回傳
		return 0;
	}

	public int demo04(int a) {  //有傳入，有回傳
		return 0;
	}

}

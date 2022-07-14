/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 *             方法可分為靜態(static)與動態*empty*
 *
 *             方法的形式有六種 1.無傳入，無回傳 2.有傳入，無回傳 3.無傳入，有回傳 4.有傳入，有回傳 5.JAVA BOOLEAN
 *             6.可變函數
 *
 *
 */
public class Demo1 {

	public void getMethodDemo() {
		return; // 即使無回傳，正確來說最後還是要加一個return
	}

	static int x = 10; // 屬性(全域變數)

	public void method1() { // 無傳入，無回傳
		System.out.println("helloworld"); // 1.一般列印
		// int a=10; //2.內部運算
		// int b=20;
		// System.out.println(a+b);
		// System.out.println(a+b+x); //3.加上屬性進行運算

	}

	public void method2(int a) { // 有傳入(可以多個，傳入Array，傳一個class)，無回傳
		String show = null; // String是依參考型態，首字母要大寫
		show = (a == 0 ? "你輸入的是" + a : a == 5 ? "你輸入的是" + a : a == 20 ? "你輸入的是" + a : "Input Error");  //使用三元判斷式作出下面IF的效果
		// if(a==0) { //可以用作基本判斷輸入的值有沒有符合需求或下去做運算
		// show="你輸入的是"+a;
		// }else if(a==5) {
		// show="你輸入的是"+a;
		// }else if(a==20){
		// show="你輸入的是"+a;
		// }else {
		// show="Input Error";
		// }
		System.out.println(show);
	}

	public int method3() { // 無傳入，有回傳
		int x = 5, y = 9;
		return x * y;
	}

	public boolean method3_1() { // 無傳入，有回傳
		return 5 > 3 ? true : false;
	}
	
	public int method3_2() { // 無傳入，有回傳
		return 20;
	}

	public int method4(int a) { // 有傳入，有回傳
		return 0;	
	}
	
	public void method5(char a,int... c) {  //可變參數 若有固定參數須放在最前面
		int x=0;
		for(int y:c) {
			x+=y;
		}
	System.out.println(x);
	}

	public static void main(String[] args) {
		Demo1 helloWorld = new Demo1();
		helloWorld.method1();
	}

}

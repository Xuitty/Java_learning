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
	public void getMethod() {
		Person p=new Person();
		p.getMethod();
		p.getMethod1();
		p.getMethod2();
		
		new Person().getMethod();;
		new Person().getMethod1();;
		new Person().getMethod2();;
		
		getMethod2(new Person());
	}
	public void getMethod2(Person p) {
		p.getMethod();
		p.getMethod1();
		p.getMethod2();
	}
}

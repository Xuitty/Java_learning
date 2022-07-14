/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/

package tw.com.hfu.code.func1;


/**
 *
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Test {
	
	@org.junit.jupiter.api.Test
	public void test() {
		GetA a=new GetA();
		GetB b=new GetB();
		b.getCount(a.getNum());
	}
	
	public void method(GetA a,GetB b) {
		b.getCount(a.getNum());
	}
	public void testMethod() {
		method(new GetA(),new GetB());
	}
}

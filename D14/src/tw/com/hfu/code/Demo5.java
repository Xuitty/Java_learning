/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;

import org.junit.jupiter.api.Test;

import tw.com.hfu.exception.MyException;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Demo5 {
	private int x;
	
	@Test
	public void test() {
		
		try {
			model(10);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void model(int x) throws MyException {
		if(x<0) {
			this.x=x;
		}else {
			throw new MyException("12345");
		}
	}
	
}

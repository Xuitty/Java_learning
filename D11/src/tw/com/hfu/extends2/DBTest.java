/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.extends2;

import org.junit.jupiter.api.Test;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class DBTest {
	
	@Test
	public void test01() {
		GetDB d=new GetDB(0, "20", "ABC@DEF.IJK");
		System.out.println(d.getDB());
		
	}
	
	@Test
	public void test02() {
		GetDBNew d2=new GetDBNew(0, "20", "ABC@DEF.IJK", "ABC", "45");
		System.out.println(d2.getDB());
	}
	
}

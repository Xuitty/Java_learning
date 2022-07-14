/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.extends1;

import org.junit.jupiter.api.Test;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class CodeTest {

	@Test
	public void Test1() {
		FuAbsClass f = new FuAbsClass() {

			@Override
			public void abs2() {
				System.out.println("2");

			}

			@Override
			public void abs1() {
				System.out.println("1");

			}
		};
		f.abs1();
		f.abs2();
	}

	@Test
	public void Test2() {
		new FuAbsClass() {

			@Override
			public void abs2() {
				System.out.println("2");

			}

			@Override
			public void abs1() {
				System.out.println("1");

			}
		}.abs1();

	}

}
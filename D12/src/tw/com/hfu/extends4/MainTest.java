/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.extends4;

import org.junit.jupiter.api.Test;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class MainTest {

	@Test
	public void test() {

		ManyClass m = new ManyClass(); // 無繼承狀態下使用一般的new，若子類別有父類別沒有的方法不能用多型
		m.test();
		m.sonTest();

	}

	@Test
	public void test1() {

		AnyClass a = new ManyClass(); // 多形(多態)，一定要走繼承
		a.test();
		// a.sonTest();

	}

	@Test
	public void test3(AnyClass a) {
		a = new ManyClass();
		a.test();
		// a.sonTest();

	}

}

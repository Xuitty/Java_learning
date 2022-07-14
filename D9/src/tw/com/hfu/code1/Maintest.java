/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code1;
import org.junit.jupiter.api.Test;
/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Maintest {
	
	@Test
	public void Test() {
		int x=new InnerTest().getNum('F');
		System.out.println(x);
	}
}

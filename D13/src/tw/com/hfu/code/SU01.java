/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;

import org.junit.jupiter.api.Test;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public abstract class SU01 implements FU01,FU02,FU03 {

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	
	
}

abstract class SU02 extends SU01{

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

}

class SU03 extends SU02{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

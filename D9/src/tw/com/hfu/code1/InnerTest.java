/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code1;
/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class InnerTest {
	
	public int getNum(char a) {
		
		if(a=='X') {
			return new Inner().numGen();
		}else if(a=='Y'){
			return new Inner().numGen1();
		}else if(a=='Z'){
			return new Inner().numGen2();
		}else {
			return 0;
		}
		
		
	}

	private class Inner{
		private int x=90;
		private int numGen() {
			return x;
		}
		private int numGen1() {
			return x+10;
		}
		private int numGen2() {
			return x+50;
		}
	}
}

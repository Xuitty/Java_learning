/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;

import java.util.Base64;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Demo3 {

	@Test
	public void Size_1() {
		Integer x = 1;
		/*
		 * switch可用的型態: 基本型態byte,short,int,char
		 * 參考型態Byte,Short,Integer,Character,String,enum
		 */
		switch (x) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		default:
			System.out.println("叭噗");
			break;
		}

	}

	@Test
	public void Size() {

		switch (Size.S) {
		case XS:
			System.out.println("XS");
			break;
		case S:
			System.out.println("S");
			break;
		case M:
			System.out.println("M");
			break;
		case L:
			System.out.println("L");
			break;
		case XL:
			System.out.println("XL");
			break;
		}

	}

	private enum Size { // 此為這個package中當public與private的enum同時存在時，會優先使用private
		XS, S, M, L, XL
	}
}

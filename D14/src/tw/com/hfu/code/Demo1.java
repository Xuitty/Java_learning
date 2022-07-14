/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

/**
 *
 *需要處理異常的結構
 *1.客戶輸入的格式
 *2.讀取文件是否存在
 *3.網路是否通順
 *4.資料庫是否開啟，建立
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Demo1 {

	@Test
	public void test() {
		Scanner k=new Scanner(System.in);
		int y=k.nextInt();
		System.out.println(y);
		k.close();
	}
}

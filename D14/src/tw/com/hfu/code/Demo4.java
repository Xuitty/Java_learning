/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Demo4 {

	@Test
	public void test() throws IOException {
		FileInputStream fis = null;
		
			fis = new FileInputStream(new File("./txt/132.txt"));
			int x;
			while ((x = fis.read()) != -1) {
				System.out.println((char) x);
			}
			fis.close();
	}


	public void test2() throws IOException {
		
		test();
		
	}
	@Test
	public void test3() {
		try {
			test2();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("123");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("456");
		}
		
	}

}
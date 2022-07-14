/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.edu.hfu.code;

import java.util.Comparator;
import java.util.function.Consumer;

import org.junit.jupiter.api.Test;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 *             1.無傳入、無回傳、匿名類別必須實作抽象方法
 *
 */
public class Demo2 {

	
	@Test
	public void test8() {

		Comparator<Integer> com2=(x,y)->{
			return x*y;
		};
		System.out.println(com2.compare(9, 1));
		
	}
	
	@Test
	public void test7() {

		Comparator<Integer> com=(x,y)->Integer.compare(x, y);
		System.out.println(com.compare(50, 50));
		
		
	}
	
	@Test
	public void test6() {

		Consumer<Object> con=x->System.out.println(x);
		con.accept(50);
		
	}
	
	@Test
	public void test5() {
		
		MyRunnable4 mr4=(x,y)->{return x+y;};
		System.out.println(mr4.run(5, 2));
		
	}

	@Test
	public void test4() {

		MyRunnable3 mr3 = (x, y) -> System.out.println(x * y);
		mr3.run(5, 7);

	}

	@Test
	public void test3() {

		MyRunnable2 mr2 = a -> System.out.println(a);
		mr2.run(10);

	}

	@Test
	public void test2() {

		MyRunnable mr = () -> System.out.println("789");
		mr.run();

	}

	@Test
	public void test() {

		Runnable r = new Runnable() {

			@Override
			public void run() {

				System.out.println("123");

			}

		};
		r.run();
		Runnable rr = () -> System.out.println("456");
		rr.run();
	}

}

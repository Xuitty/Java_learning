/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import org.junit.jupiter.api.Test;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Demo1 {

	@Test
	public void test() {
		
		List<Object> l=new ArrayList<>();
		
		l.add('v');
		l.add("DD");
		l.add(123);
		l.add(456);
		l.add(789);
		ArrayList<Object> l1=(ArrayList<Object>)l;
		l.add(000);
		l1.trimToSize();

	
	}

	public void test2() {  //類別若使用子類別，則傳入限定該子類別
		
		ArrayList<Object> a=new ArrayList<>();
		a.add('a');
		a.trimToSize();
	}

	public void test3() {  //類別使用父類別List，傳入可以以其子類別，但子類別獨有的方法不能使用
		method(new ArrayList<>());
		method(new LinkedList<>());
		method(new Vector<>());
		
	}
	
	public void method(List<Object> obj) {
		List<Object> l2=new ArrayList<>();
		
	}
	
}

/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

import tw.com.hfu.code.MainTest;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Demo1 {
	
	
	
	@Test
	public void test() {
		MainTest m=new MainTest();
		List<Object> l=new ArrayList<>();  //ArrayList操作搜尋更新快，新增刪除慢 ; LinkedList操作新增刪除快，搜尋更新慢
		
		l.add((byte)12);//0
		l.add((short)543);//1
		l.add((long)234);//2
		l.add((float)236);//3
		l.add((double)43);//5
		l.add((int)876);//6
		//m.getPrint1(l);
		//System.out.println("===============================");
		l.add(4, 444);  //插入值並增加長度 4
		List<Object> lo= l.subList(0, 3);
		Iterator<Object> it= l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		for(Object z:lo) {
//			System.out.println(z);
//		}
//		
		//l.set(0, null);  //直接改值
		//m.getPrint1(l);
		//System.out.println(l.size());
	}
}

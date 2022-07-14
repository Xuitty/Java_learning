/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;

import java.util.Iterator;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Demo2 {
	
	@Test
	public void linkedTest() {
		
		LinkedList<Double> ll=new LinkedList<>();
		
		ll.add(50.4);
		ll.add(213.566);
		ll.add(423.1233);
		ll.add(745.3123);
		ll.offerLast(3.333333333333);
		ll.add(53.138);
		ll.addFirst(127.3);
		ll.addLast(13.123);
		ll.offer(1.11111);
		ll.offerFirst(2.222222222);
		
		
		
		Iterator<Double> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}
}

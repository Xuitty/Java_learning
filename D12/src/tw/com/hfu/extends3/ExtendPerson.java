/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.extends3;

import tw.com.hfu.extends2.Person;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class ExtendPerson extends Person {

	public void test1() {
		Person p = new Person();
		p.age = ""; // protected
		p.email = ""; // public
		p.name = ""; // default
	}
	
}

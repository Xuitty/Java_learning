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
public class GetPerson1 {

	public void test1() {
		Person p = new Person();
		p.email = ""; // public 不同package下無繼承關係只叫的到public
	}

}

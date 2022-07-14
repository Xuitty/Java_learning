/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.extends2;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class GetDBNew extends GetDB {

	private String name, age;

	public GetDBNew(int id, String num, String email, String name, String age) {
		super(id, num, email);
		this.name = name;
		this.age = age;
	}
	
	public String getDB() {
		return name+age;
	}

}

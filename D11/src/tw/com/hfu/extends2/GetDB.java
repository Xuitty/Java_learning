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
@Deprecated
public class GetDB {

	
	private int id;
	private String num,email;
	
	
	
	public GetDB(String num, String email) {
		super();
		this.num = num;
		this.email = email;
	}


	public GetDB(int id, String num, String email) {
		super();
		this.id = id;
		this.num = num;
		this.email = email;
	}


	public String getDB() {
		return num+email;
	}
}

/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;
/**
 * 父類別
 * JAVA單繼承
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class FuClass {
	
	
	public FuClass() {

	}
	public FuClass(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	private Integer id;
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name;
	}
	
}

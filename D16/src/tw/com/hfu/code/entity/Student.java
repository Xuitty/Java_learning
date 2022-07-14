/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code.entity;
/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Student extends Person {
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String age) {
		super(id, name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [id=" + super.getId() + ", name=" + super.getName() + ", age=" + super.getAge() + "]";
	}
}

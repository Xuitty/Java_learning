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
public class Employee {

	private String name;
	private int age;
	private double pay;

	public Employee() {}
	
	public Employee(String name, int age, double pay) {
		super();
		this.name = name;
		this.age = age;
		this.pay = pay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", pay=" + pay + "]";
	}

}

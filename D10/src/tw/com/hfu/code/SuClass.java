/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;
/**
 *子類別
 *使用extends繼承某class使該class其成為父類別，此class成為子類別
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class SuClass extends FuClass {
 private String age,address;

public SuClass(Integer id, String name, String age, String address) {
	super(id, name);
	this.age = age;
	this.address = address;
}

public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return super.toString() +  ", age=" + age + ", address=" + address + "]";
}

 
}

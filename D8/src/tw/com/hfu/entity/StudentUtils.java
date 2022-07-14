/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.entity;
/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class StudentUtils {
	
	public String checkIdAndPass(int id, String pass) {
		Student s=new Student();
		s.setId(0);
		s.setPass("123456");
		if (s.getId() == id && s.getPass() == pass) {
			return "Login Successful";
		} else {
			return "Login Failure";
		}
	}
}

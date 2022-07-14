/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Student implements Serializable {

		/**
	 * 
	 */
	private static final long serialVersionUID = -4331708322436791175L;
		private int id;
		private String name,age;
		
		public Student() {}
		
		public Student(int id, String name, String age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			return id == other.id;
		}
		
	
		
		
	
}

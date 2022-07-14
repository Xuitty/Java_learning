/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.extends1;

import org.junit.jupiter.api.Test;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class AllClasss {

	@Test
	public void Test01() {

		Student s = new Student();
		getAll(s);
		getAll(new Worker());
		getAll(new Others());
		getAll(new FuClass());

	}

	public void getAll(FuClass f) {
		if (f instanceof Student) {
			
			f.sleep();
			f.eat();
			//((Student) f).read();  //等同下行
			Student s=(Student)f;  //因子類別已經被提升至父類別，因此必須轉換成子類別才能做使用
			s.read();
			
		} else if (f instanceof Worker) {

			f.sleep();
			f.eat();
			//((Worker) f).work();  //等同下行
			Worker w=(Worker)f;  //因子類別已經被提升至父類別，因此必須轉換成子類別才能做使用
			w.work();

		} else if (f instanceof Others) {

			f.sleep();
			f.eat();

		} else {

			f.sleep();
			f.eat();

		}

	}

}

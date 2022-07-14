/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;
/**
 *建構子
 *
 *1.建構子名稱要與Class一樣 包含大小寫
 *2.建構子無回傳概念，建構這個class 再建立實體(new)
 *3.建構子有傳入值，可以使用多載
 *
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 *this代表自身class
 *super代表父類別class
 *
 *this() 呼叫本身無傳入值建構子
 *super() 呼叫父類別無傳入值建構子
 *
 */
public class ClassObject1 {
	private int id ;
	private String name,address;
	public ClassObject1(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
}

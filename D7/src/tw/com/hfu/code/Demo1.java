/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.code;
/**
 *基本型態:byte short int long float double boolean char
 *參考型態:Byte Short Integer Float Double Boolean Character String 自訂型態()
 *
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Demo1 {
	private Integer id;  //Default=null
		//屬性可以加上四種安全修飾子，不需要初始化，讀取範圍為class內方法外，型態設定為屬性型態
	private int age; //==private Integer age;
					 //autoboxing autounboxing
	
	public void getVar() {
		int pay=;
		Integer id;  //==int id;
					 //autoboxing autounboxing
		System.out.println(pay);
		System.out.println(id);
		
	}	//變數必須初始化，不能使用安全修飾子，型態設定為基本型態，讀取範圍限方法內
}

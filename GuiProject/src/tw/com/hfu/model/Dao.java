/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.model;

import java.sql.ResultSet;
import java.util.ArrayList;

import tw.com.hfu.entity.Employee;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public interface Dao {
	
	
	//新增C
	
	public abstract void add(Employee emp);
	
	//查詢R
	
	public abstract ArrayList<Employee> getEmployee();
	
	//更新U
	
	public abstract ResultSet update();
	
	//刪除D
	
	public abstract void delete(int eid);
	
	
}

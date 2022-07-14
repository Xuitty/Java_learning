/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.model.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.xdevapi.Table;

import tw.com.hfu.dbutils.CountDB;
import tw.com.hfu.entity.Employee;
import tw.com.hfu.model.Dao;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class EmployeeDao implements Dao {

	Connection conn = null;
	PreparedStatement ps = null;

	@Override
	public void add(Employee emp) {

		conn = CountDB.getConnection();
		String sql = "insert into employee(eName,eAge,eEmail,eAddress,eTel)values(?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, emp.geteName());
			ps.setString(2, emp.geteAge());
			ps.setString(3, emp.geteEmail());
			ps.setString(4, emp.geteAddress());
			ps.setString(5, emp.geteTel());
			int y = ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Successful add " + y + " data(s)", "Notification",
					JOptionPane.CLOSED_OPTION);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			CountDB.close(ps);
			CountDB.close(conn);
		}

	}

	@Override
	public ArrayList<Employee> getEmployee() {

		ArrayList<Employee> list=new ArrayList<Employee>();
		return list;
	}

	@Override
	public ResultSet update() {
		
		ResultSet rs=null;
		int c=0;
		conn = CountDB.getConnection();
		String sql = "select * from employee";
		//DefaultTableModel df=(DefaultTableModel)table.getModel();
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			ResultSetMetaData rss=rs.getMetaData();
			c=rss.getColumnCount();
			return rs;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}

	@Override
	public void delete(int eid) {
		conn = CountDB.getConnection();
		String sql = "delete from employee where eid=?";
		
	}

	
	
}

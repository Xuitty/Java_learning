/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * 需要打開及關閉的的三大架構 1.資料庫 2.網路 3.檔案
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class CountDB {
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/guiproject?serverTimezone=UTC&useSSL=false";
	private static final String JDBC_NAME = "root";
	private static final String JDBC_PASSWORD = "Password123";
	private static Connection conn = null;

	static {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connect Successful");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		try {
			conn = DriverManager.getConnection(JDBC_URL, JDBC_NAME, JDBC_PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(Connection conn) { // 傳送Driver，並驗證帳號密碼
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void close(PreparedStatement ps) { // 傳送SQL語法，並防止SQL Inject Attack
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void close(Statement st) { // 傳送SQL語法
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void close(ResultSet rs) { // 接收語法的資料與存取
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

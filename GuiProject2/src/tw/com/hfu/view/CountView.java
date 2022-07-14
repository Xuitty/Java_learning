/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.view;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tw.com.hfu.dbutils.CountDB;
import tw.com.hfu.entity.Employee;
import tw.com.hfu.model.Dao;
import tw.com.hfu.model.impl.EmployeeDao;
import tw.com.hfu.exception.MyException;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class CountView extends JFrame {

	private JPanel contentPane;
	private JTextField input_eId;
	private JTextField input_eName;
	private JTextField input_eAge;
	private JTextField input_eEmail;
	private JTextField input_eTel;
	private JTextField input_eAddress;
	private JTextField eId;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CountView frame = new CountView();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CountView() {
		setTitle("Employee Manage System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(CountView.class.getResource("/images/Sample_User_Icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 605);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Add, Delete, Update Data(s)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 10, 425, 254);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(10, 26, 69, 15);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setBounds(10, 63, 69, 15);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Age:");
		lblNewLabel_2.setBounds(10, 100, 69, 15);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Address:");
		lblNewLabel_3.setBounds(10, 174, 69, 15);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("Tel:");
		lblNewLabel_3_1.setBounds(10, 211, 69, 15);
		panel.add(lblNewLabel_3_1);

		JLabel lblNewLabel_3_2 = new JLabel("E-mail:");
		lblNewLabel_3_2.setBounds(10, 137, 69, 15);
		panel.add(lblNewLabel_3_2);

		input_eId = new JTextField();
		input_eId.setBounds(80, 23, 26, 21);
		panel.add(input_eId);
		input_eId.setEnabled(false);
		input_eId.setColumns(10);

		input_eName = new JTextField();
		input_eName.setBounds(79, 60, 124, 21);
		panel.add(input_eName);
		input_eName.setColumns(10);

		input_eAge = new JTextField();
		input_eAge.setBounds(79, 95, 26, 21);
		panel.add(input_eAge);
		input_eAge.setColumns(10);

		input_eEmail = new JTextField();
		input_eEmail.setBounds(79, 129, 124, 21);
		panel.add(input_eEmail);
		input_eEmail.setColumns(10);

		input_eAddress = new JTextField();
		input_eAddress.setBounds(79, 167, 191, 21);
		panel.add(input_eAddress);
		input_eAddress.setColumns(10);

		input_eTel = new JTextField();
		input_eTel.setBounds(79, 205, 124, 21);
		panel.add(input_eTel);
		input_eTel.setColumns(10);

		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(300, 29, 87, 23);
		panel.add(btnAdd);

		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// String id=input_eId.getText();
				// String name=input_eName.getText();
				// String age=input_eAge.getText();
				// String email=input_eEmail.getText();

				// System.out.println(id+"="+name+"="+age+"="+email);

				Employee emp = new Employee();

				String name = input_eName.getText();
				String age = input_eAge.getText();
				String email = input_eEmail.getText();
				String address = input_eAddress.getText();
				String tel = input_eTel.getText();

				if (name.length() > 1 && name.length() < 31) {
					emp.seteName(input_eName.getText());
				} else {
					throw new MyException("Name input error");
				}
//				if (age.length() > 0 && age.length() < 31) {
					emp.seteAge(input_eAge.getText());
//				} else {
//					throw new MyException("Age input error");
//				}
//				if (email.length() > 1 && email.length() < 31) {
					emp.seteEmail(input_eEmail.getText());
//				} else {
//					throw new MyException("Email input error");
//				}
//				if (address.length() > 1 && address.length() < 31) {
					emp.seteAddress(input_eAddress.getText());
//				} else {
//					throw new MyException("Address input error");
//				}
//				if (tel.length() > 1 && tel.length() < 31) {
					emp.seteTel(input_eTel.getText());
//				} else {
//					throw new MyException("Telephone input error");
//				}
				
				
				
				
				// emp1.setEid(Integer.parseInt(input_eId.getText()));

				// input_eId.setText((""));
				input_eName.setText((""));
				input_eAge.setText((""));
				input_eEmail.setText((""));
				input_eAddress.setText((""));
				input_eTel.setText((""));

				Dao ed = new EmployeeDao();
				ed.add(emp);

			}
		});

		JButton btnDel = new JButton("Delete");
		btnDel.setBounds(300, 87, 87, 23);
		panel.add(btnDel);
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(300, 145, 87, 23);
		panel.add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn=null;
				PreparedStatement ps=null;
				ResultSet rs=null;
				
				conn=CountDB.getConnection();
				String sql="select * from employee";
				try {
					ps=conn.prepareStatement(sql);
					rs=ps.executeQuery();
					int c=0;
					ResultSetMetaData rss=rs.getMetaData();
					c=rss.getColumnCount();
					
					DefaultTableModel df=(DefaultTableModel)table.getModel();
					
					df.setRowCount(0);
					while(rs.next()) {
						Vector<String> ver=new Vector<String>();
						
						for(int i=0;i<=c;i++) {
							
							ver.add(rs.getString("eid"));
							ver.add(rs.getString("eName"));
							ver.add(rs.getString("eAge"));
							ver.add(rs.getString("eEmail"));
							ver.add(rs.getString("eAddress"));
							ver.add(rs.getString("eTel"));
							
						}
						df.addRow(ver);
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(300, 203, 87, 23);
		panel.add(btnExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 290, 417, 266);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label:");
		lblNewLabel_4.setBounds(10, 14, 71, 15);
		panel_1.add(lblNewLabel_4);
		
		eId = new JTextField();
		eId.setBounds(79, 11, 96, 21);
		panel_1.add(eId);
		eId.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				eId.getText(String );
				
			}
		});
		btnNewButton.setBounds(299, 10, 87, 23);
		panel_1.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 49, 397, 206);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name", "Age", "Email", "Address", "Tel"
			}
		));
		scrollPane.setViewportView(table);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

	}
}

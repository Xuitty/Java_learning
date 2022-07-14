/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class MainView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public MainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 424);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File(F)");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New(N)");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Open(O)");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OpenView ov=new OpenView();
				ov.view();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("New menu");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("New menu");
		menuBar.add(mnNewMenu_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 545, 342);
		contentPane.add(panel);
		panel.setLayout(new MigLayout("", "[127.00][][][]", "[][][][][][][][][][][][]"));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("123");
			}
		});
	
		panel.add(chckbxNewCheckBox, "cell 0 0");
		
		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel, "cell 3 0");
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		panel.add(chckbxNewCheckBox_1, "cell 0 1");
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel.add(lblNewLabel_1, "cell 3 1");
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		panel.add(chckbxNewCheckBox_2, "cell 0 2");
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel.add(lblNewLabel_2, "cell 3 2");
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("New check box");
		panel.add(chckbxNewCheckBox_3, "cell 0 3");
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		panel.add(lblNewLabel_3, "cell 3 3");
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("New check box");
		panel.add(chckbxNewCheckBox_4, "cell 0 4");
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		panel.add(lblNewLabel_4, "cell 3 4");
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("New check box");
		panel.add(chckbxNewCheckBox_5, "cell 0 5");
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		panel.add(lblNewLabel_5, "cell 3 5");
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("New check box");
		panel.add(chckbxNewCheckBox_6, "cell 0 6");
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		panel.add(lblNewLabel_6, "cell 3 6");
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("New check box");
		panel.add(chckbxNewCheckBox_7, "cell 0 7");
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		panel.add(lblNewLabel_7, "cell 3 7");
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("New check box");
		panel.add(chckbxNewCheckBox_8, "cell 0 8");
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		panel.add(lblNewLabel_9, "cell 3 8");
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("New check box");
		panel.add(chckbxNewCheckBox_9, "cell 0 9");
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		panel.add(lblNewLabel_8, "cell 3 9");
		
		JCheckBox chckbxNewCheckBox_10 = new JCheckBox("New check box");
		panel.add(chckbxNewCheckBox_10, "cell 0 10");
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		panel.add(lblNewLabel_10, "cell 3 10");
		
		JCheckBox chckbxNewCheckBox_11 = new JCheckBox("New check box");
		panel.add(chckbxNewCheckBox_11, "cell 0 11");
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		panel.add(lblNewLabel_11, "cell 3 11");
	}
}

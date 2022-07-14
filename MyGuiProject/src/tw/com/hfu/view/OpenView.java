/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSlider;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class OpenView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void view() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpenView ov = new OpenView();
					ov.setLocationRelativeTo(null);
					ov.setResizable(false);
					ov.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OpenView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JSlider slider = new JSlider();
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(47, 218, 342, 14);
		
		progressBar.setValue(slider.getValue());
		contentPane.add(progressBar);
		slider.setBounds(118, 168, 200, 26);
		contentPane.add(slider);
		progressBar.setBounds(47, 218, 342, 14);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				progressBar.setValue(slider.getValue());
			}
		});
		btnNewButton.setBounds(177, 92, 87, 23);
		contentPane.add(btnNewButton);
		
		}
		
}

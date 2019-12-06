package com.bit.day27;

import java.awt.Frame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Color;

public class Ex01 extends Frame{
	private JTextField tfKor;
	private JTextField tfEng;
	private JTextField tfMath;

	public Ex01() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("학생성적관리프로그램");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("HY궁서", Font.BOLD, 20));
		panel.add(label, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("\uC785\uB825");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 입력
			}
		});
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC218\uC815");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 수정
			}
		});
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC0AD\uC81C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 삭제
			}
		});
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uC885\uB8CC");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		panel_1.add(btnNewButton_3);
		
		JPanel add_view = new JPanel();
		add_view.setBackground(new Color(0, 128, 128));
		add_view.setForeground(new Color(0, 128, 128));
		panel.add(add_view, BorderLayout.CENTER);
		add_view.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAD6D\uC5B4");
		lblNewLabel.setBounds(34, 78, 57, 15);
		add_view.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC601\uC5B4");
		lblNewLabel_1.setBounds(184, 78, 57, 15);
		add_view.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC218\uD559");
		lblNewLabel_2.setBounds(334, 78, 57, 15);
		add_view.add(lblNewLabel_2);
		
		tfKor = new JTextField();
		tfKor.setBounds(34, 103, 116, 21);
		add_view.add(tfKor);
		tfKor.setColumns(10);
		
		tfEng = new JTextField();
		tfEng.setBounds(184, 103, 116, 21);
		add_view.add(tfEng);
		tfEng.setColumns(10);
		
		tfMath = new JTextField();
		tfMath.setBounds(334, 103, 116, 21);
		add_view.add(tfMath);
		tfMath.setColumns(10);
		
		JButton btnInsert = new JButton("\uC785\uB825\uC2E4\uD589");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// sqlInsert
				int kor =Integer.parseInt(tfKor.getText());
				int eng =Integer.parseInt(tfEng.getText());
				int math =Integer.parseInt(tfMath.getText());
				
				
			}
		});
		btnInsert.setBounds(122, 174, 97, 23);
		add_view.add(btnInsert);
		
		JButton btnNewButton_5 = new JButton("\uCDE8\uC18C");
		btnNewButton_5.setBounds(275, 174, 97, 23);
		add_view.add(btnNewButton_5);
		setBounds(100-1024,100,500,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}

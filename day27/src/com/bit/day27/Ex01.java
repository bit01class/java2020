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

import oracle.jdbc.OracleDriver;

import java.awt.Color;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.awt.Choice;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Button;

public class Ex01 extends Frame{
	private JTextField tfKor;
	private JTextField tfEng;
	private JTextField tfMath;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public Ex01() {
		oracle.jdbc.driver.OracleDriver driver=null;
		driver=new OracleDriver();
		final String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		final java.util.Properties info=new Properties();
		info.setProperty("user", "scott");
		info.setProperty("password", "tiger");
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		final JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("학생성적관리프로그램");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("HY궁서", Font.BOLD, 20));
		panel.add(label, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.SOUTH);
		
		final JPanel list_view= new JPanel();
		panel.add(list_view, BorderLayout.CENTER);
		
		
		JButton btnNewButton = new JButton("\uC785\uB825");
		JButton btnNewButton_1 = new JButton("\uC218\uC815");
		JButton btnNewButton_2 = new JButton("\uC0AD\uC81C");
		JButton btnNewButton_3 = new JButton("\uC885\uB8CC");
		
		panel_1.add(btnNewButton);
		panel_1.add(btnNewButton_1);
		panel_1.add(btnNewButton_2);
		panel_1.add(btnNewButton_3);
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		final JPanel del_view = new JPanel();
		
		final Choice choice = new Choice();
		del_view.add(choice);
		
		JButton button = new JButton("\uC0AD\uC81C");
		del_view.add(button);
		
		final JPanel add_view = new JPanel();
		add_view.setBackground(new Color(0, 128, 128));
		add_view.setForeground(new Color(0, 128, 128));
		
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
				
				String sql="{call stu01_add("+kor+","+eng+","+math+")}";
				java.sql.Connection conn=null;
				java.sql.CallableStatement cstmt=null;
				try {
					conn=java.sql.DriverManager.getConnection(url, info);
					cstmt=conn.prepareCall(sql);
					cstmt.execute();
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally{
					try {
						if(cstmt!=null)cstmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				
				tfKor.setText("");
				tfEng.setText("");
				tfMath.setText(null);
			}
		});
		btnInsert.setBounds(122, 174, 97, 23);
		add_view.add(btnInsert);
		
		JButton btnNewButton_5 = new JButton("\uCDE8\uC18C");
		btnNewButton_5.setBounds(275, 174, 97, 23);
		add_view.add(btnNewButton_5);
				
		final JPanel edit_view = new JPanel();
		
		GridBagLayout gbl_edit_view = new GridBagLayout();
		gbl_edit_view.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_edit_view.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_edit_view.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_edit_view.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		edit_view.setLayout(gbl_edit_view);
		
		JLabel lblNewLabel_3 = new JLabel("\uD559\uBC88");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 1;
		edit_view.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uAD6D\uC5B4");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 1;
		edit_view.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uC601\uC5B4");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 2;
		gbc_lblNewLabel_5.gridy = 1;
		edit_view.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\uC218\uD559");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_6.gridx = 3;
		gbc_lblNewLabel_6.gridy = 1;
		edit_view.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		Choice choice_1 = new Choice();
		GridBagConstraints gbc_choice_1 = new GridBagConstraints();
		gbc_choice_1.insets = new Insets(0, 0, 5, 5);
		gbc_choice_1.gridx = 0;
		gbc_choice_1.gridy = 2;
		edit_view.add(choice_1, gbc_choice_1);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		edit_view.add(textField, gbc_textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		edit_view.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 2;
		edit_view.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridwidth = 4;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 3;
		edit_view.add(panel_2, gbc_panel_2);
		
		Button button_1 = new Button("\uC218\uC815");
		panel_2.add(button_1);
		
		Button button_2 = new Button("\uCDE8\uC18C");
		panel_2.add(button_2);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 입력
				panel.remove(list_view);
				panel.remove(edit_view);
				panel.remove(del_view);
				panel.add(add_view, BorderLayout.CENTER);
				panel.revalidate();
				panel.repaint();
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 수정
				panel.remove(list_view);
				panel.remove(add_view);
				panel.remove(del_view);
				panel.add(edit_view, BorderLayout.CENTER);
				panel.revalidate();
				panel.repaint();
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 삭제
				panel.remove(list_view);
				panel.remove(add_view);
				panel.remove(edit_view);
				panel.add(del_view, BorderLayout.CENTER);
				panel.revalidate();
				panel.repaint();
				
				// select num from stu01 order by num;
				String sql="{call stu01_num(?)}";
				Connection conn=null;
				CallableStatement cstmt=null;
				ResultSet rs=null;
				try {
					conn=DriverManager.getConnection(url, info);
					cstmt=conn.prepareCall(sql);
					cstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
					cstmt.execute();
					rs=(ResultSet) cstmt.getObject(1);
					while(rs.next()){
						choice.add(rs.getObject(1).toString());
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally{
					try {
						if(rs!=null)rs.close();
						if(cstmt!=null)cstmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		setBounds(100-1024,100,500,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}

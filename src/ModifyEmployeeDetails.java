import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.vikas.jdbc.utilities.*;
import com.vikas.jdbc.Daos.*;
import com.vikas.jdbc.pojos.*;

import java.sql.*;
import java.util.*;
import java.io.*;
import java.util.Date;


import javax.swing.*;

public class ModifyEmployeeDetails extends JPanel implements ActionListener{
	
	JTextField ftf[];

	public  ModifyEmployeeDetails() {
		ftf = new JTextField[6];
		String str[] = new String[ftf.length];
		
		str[0] = "ENTER Department ID";
		ftf[0] = new JTextField(new Integer(10));

		str[1] = "ENTER Employee Name";
		ftf[1] = new JTextField(new String());
		
		str[2] = "ENTER Employee Designation";
		ftf[2] = new JTextField(new String());

		str[3] = "ENTER Employee Salary";
		ftf[3] = new JTextField(new Integer(5));
		
		str[4] = "ENTER Date";
		ftf[4] = new JTextField(new String());
		
		str[5] = "ENTER Employee ID";
		ftf[5] = new JTextField(new String());
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
			
			
			JPanel borderPanel2= new JPanel(new java.awt.BorderLayout());
			borderPanel2.setBorder(new javax.swing.border.TitledBorder(str[1]));
			borderPanel2.add(ftf[1], java.awt.BorderLayout.CENTER);
			add(borderPanel2);
			
			JPanel borderPanel3 = new JPanel(new java.awt.BorderLayout());
			borderPanel3.setBorder(new javax.swing.border.TitledBorder(str[2]));
			borderPanel3.add(ftf[2], java.awt.BorderLayout.CENTER);
			add(borderPanel3);
			
			JPanel borderPanel6 = new JPanel(new java.awt.BorderLayout());
			borderPanel6.setBorder(new javax.swing.border.TitledBorder(str[5]));
			borderPanel6.add(ftf[5], java.awt.BorderLayout.CENTER);
			add(borderPanel6);
			
			JPanel borderPanel = new JPanel(new java.awt.BorderLayout());
			borderPanel.setBorder(new javax.swing.border.TitledBorder(str[0]));
			borderPanel.add(ftf[0], java.awt.BorderLayout.CENTER);
			add(borderPanel);
			
			JPanel borderPanel4= new JPanel(new java.awt.BorderLayout());
			borderPanel4.setBorder(new javax.swing.border.TitledBorder(str[3]));
			borderPanel4.add(ftf[3], java.awt.BorderLayout.CENTER);
			add(borderPanel4);
			
			JPanel borderPanel5 = new JPanel(new java.awt.BorderLayout());
			borderPanel5.setBorder(new javax.swing.border.TitledBorder(str[4]));
			borderPanel5.add(ftf[4], java.awt.BorderLayout.CENTER);
			add(borderPanel5);
			
			JButton OkButton = new JButton("OK");
			add(OkButton);
			OkButton.addActionListener(this);
	}
		         public void actionPerformed(ActionEvent e) {   
		        	 try {
		 			int deptid = Integer.parseInt(ftf[0].getText());
		 			int id = Integer.parseInt(ftf[5].getText());
		 			String name = ftf[1].getText();
		 		    String designation = ftf[2].getText();
		 			int salary = Integer.parseInt(ftf[3].getText());
		 		    String date = ftf[4].getText();
		 			java.util.Date dt = Dateutilities.convertDate(date);
		 			Employees emp = new Employees(id, name, deptid, designation, dt, salary);
		 			EmployeesDao ed = new EmployeesDao();
		 			if((name.charAt(0) >= 'a' && name.charAt(0) <= 'z') || (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z')) {
			 			boolean b = ed.createEmployees(emp);
			 			if(b == true)
			 			JOptionPane.showMessageDialog(this, "Employee Edited", "New Employee", JOptionPane.INFORMATION_MESSAGE);
			 			}
			         }catch (Exception ex) {
			        		JOptionPane.showMessageDialog(this, "Please Enter valid Data", "New Employee", JOptionPane.INFORMATION_MESSAGE);
			         }
		         }     
	      
	}





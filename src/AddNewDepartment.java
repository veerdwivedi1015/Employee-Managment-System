import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import com.vikas.jdbc.utilities.*;
import com.vikas.jdbc.Daos.*;
import com.vikas.jdbc.pojos.*;

import java.sql.*;
import java.util.*;
import java.io.*;
import java.util.Date;


import javax.swing.*;

public class AddNewDepartment extends JPanel implements ActionListener {
	
	JFormattedTextField ftf[];

	public  AddNewDepartment() {
		ftf = new JFormattedTextField[2];
		String str[] = new String[ftf.length];
		
		str[0] = "ENTER DEPARTMENT NAME";
		ftf[0] = new JFormattedTextField(new String());

		str[1] = "ENTER DEPARTMENT DETAILS";
		ftf[1] = new JFormattedTextField(new String());
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
			JPanel borderPanel = new JPanel(new java.awt.BorderLayout());
			borderPanel.setBorder(new javax.swing.border.TitledBorder(str[0]));
			borderPanel.add(ftf[0], java.awt.BorderLayout.CENTER);
			add(borderPanel);
			JPanel borderPanel2= new JPanel(new java.awt.BorderLayout());
			borderPanel2.setBorder(new javax.swing.border.TitledBorder(str[1]));
			borderPanel2.add(ftf[1], java.awt.BorderLayout.CENTER);
			add(borderPanel2);
			
			JButton OkButton = new JButton("OK");
			add(OkButton);
			OkButton.addActionListener(this);
	}  
			
		         public void actionPerformed(ActionEvent e) {     
		 			String name =ftf[0].getText();
		 			String details = ftf[1].getText();
		 			Department dept = new Department(name, details);
		 			DepartmentDao dd = new DepartmentDao();
		 			try {
		 			if((name.charAt(0) >= 'a' && name.charAt(0) <= 'z') || (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z')) {
		 			boolean b = dd.createDepartment(dept);
		 			if(b == true)
		 			JOptionPane.showMessageDialog(this, "Department Added", "New Department", JOptionPane.INFORMATION_MESSAGE);
		 			}
		         }catch (Exception ex) {
		        		JOptionPane.showMessageDialog(this, "Please Enter valid Data", "New Department", JOptionPane.INFORMATION_MESSAGE);
		         }
		         }
}

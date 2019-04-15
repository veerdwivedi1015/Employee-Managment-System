import java.awt.BorderLayout;
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
public class SearchEmployeeByDepartment extends JPanel implements ActionListener{
	
	JTextField ftf;
	JTextArea jtAreaOutput;
	String newline = "\n";
	public SearchEmployeeByDepartment() {
	jtAreaOutput = new JTextArea(5, 20);
	jtAreaOutput.setCaretPosition(jtAreaOutput.getDocument().getLength());
	jtAreaOutput.setEditable(false);
	JScrollPane scrollPane = new JScrollPane(jtAreaOutput, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	setLayout(new BorderLayout());
	add(scrollPane, BorderLayout.CENTER);
	
	ftf = new JTextField();
	String str = new String();
	
	str = "ENTER Employee Department";
	ftf = new JTextField(new Integer(10));
	
	add(ftf,BorderLayout.NORTH);
	
	JButton OkButton = new JButton("OK");
	add(OkButton,BorderLayout.SOUTH);
	OkButton.addActionListener(this);
	}
	   
	
         public void actionPerformed(ActionEvent e) {  
        	 try {
 			int department = Integer.parseInt(ftf.getText());
 			EmployeesDao ed = new EmployeesDao();
			ArrayList<Employees> al = ed.getEmployeesWithDeptId(department);
			for (Employees emp : al)
				jtAreaOutput.append(emp + newline);
	         }catch (Exception ex) {
	        		JOptionPane.showMessageDialog(this, "Please Enter valid Data", "New Employee", JOptionPane.INFORMATION_MESSAGE);
	         }
         }
		
	
	
}




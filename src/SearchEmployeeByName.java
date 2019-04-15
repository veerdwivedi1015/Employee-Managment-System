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

public class SearchEmployeeByName extends JPanel implements ActionListener{
	
	JTextField ftf;
	JTextArea jtAreaOutput;
	String newline = "\n";
	public SearchEmployeeByName() {
	jtAreaOutput = new JTextArea(5, 20);
	jtAreaOutput.setCaretPosition(jtAreaOutput.getDocument().getLength());
	jtAreaOutput.setEditable(false);
	JScrollPane scrollPane = new JScrollPane(jtAreaOutput, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	setLayout(new BorderLayout());
	add(scrollPane, BorderLayout.CENTER);
	
	ftf = new JTextField();
	String str = new String();
	
	str = "ENTER Employee Name";
	ftf = new JTextField(new String());
	
	add(ftf,BorderLayout.NORTH);
	
	JButton OkButton = new JButton("OK");
	add(OkButton,BorderLayout.SOUTH);
	OkButton.addActionListener(this);
	}
         public void actionPerformed(ActionEvent e) {  
        	 try {
 			String name = ftf.getText();
 			EmployeesDao ed = new EmployeesDao();
			ArrayList<Employees> al = ed.getEmployeesWithByName(name);
			for (Employees emp : al)
				jtAreaOutput.append(emp + newline);
			if((name.charAt(0) >= 'a' && name.charAt(0) <= 'z') || (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z')) {
	 			
	 			}
	         }catch (Exception ex) {
	        		JOptionPane.showMessageDialog(this, "Please Enter valid Data", "New Employee", JOptionPane.INFORMATION_MESSAGE);
	         }
         }
		
	
	
}



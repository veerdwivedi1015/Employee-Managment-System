import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
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
public class SearchEmployeeBySalary extends JPanel implements ActionListener{
	JLabel label1;
	JLabel label2;
	JTextField ftf[];
	JTextArea jtAreaOutput;
	String newline = "\n";
	public SearchEmployeeBySalary() {
	jtAreaOutput = new JTextArea(5, 20);
	jtAreaOutput.setCaretPosition(jtAreaOutput.getDocument().getLength());
	jtAreaOutput.setEditable(false);
	JScrollPane scrollPane = new JScrollPane(jtAreaOutput, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	setLayout(new GridLayout(6, 1, 3, 3));
	
	
	ftf = new JTextField[2];
	label1 = new JLabel("Enter Minimum salary");
	label1.setFont(new Font("Times New Roman", Font.BOLD, 24));
	label1.setOpaque(true);
	label1.setBackground(Color.red);
	label1.setForeground(Color.yellow);
	
	
	ftf[0] = new JTextField(new Integer(10000));
	ftf[1] = new JTextField(new Integer(10000));

	
	add(label1);
	add(ftf[0]);
	
	label2 = new JLabel("Enter Maximum salary");
	label2.setFont(new Font("Times New Roman", Font.BOLD, 24));
	label2.setOpaque(true);
	label2.setBackground(Color.red);
	label2.setForeground(Color.yellow);
	
	add(label2);
	add(ftf[1]);
	
	JButton OkButton = new JButton("OK");
	add(OkButton);
	add(scrollPane);
	OkButton.addActionListener(this);
	}
         public void actionPerformed(ActionEvent e) {  
        	 try {
 			int minsalary = Integer.parseInt(ftf[0].getText());
 			int maxsalary = Integer.parseInt(ftf[0].getText());
 			EmployeesDao ed = new EmployeesDao();
			ArrayList<Employees> al = ed.getEmployeesWithBySalary(minsalary, maxsalary);
			for (Employees emp : al)
				jtAreaOutput.append(emp + newline);
        	 }catch (Exception ex) {
	        		JOptionPane.showMessageDialog(this, "Please Enter valid Data", "New Employee", JOptionPane.INFORMATION_MESSAGE);
	         }
         }

		
	
	
}




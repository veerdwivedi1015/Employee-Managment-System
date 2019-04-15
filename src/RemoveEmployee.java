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

public class RemoveEmployee extends JPanel {
	JLabel label1;
	JTextField ftf;
	
	public  RemoveEmployee() {
		ftf = new JTextField();
		String str = new String();
		
		str = "ENTER Employee ID";
		ftf = new JTextField(new Integer(10));
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel borderPanel = new JPanel(new java.awt.BorderLayout());
		borderPanel.setBorder(new javax.swing.border.TitledBorder(str));
		borderPanel.add(ftf, java.awt.BorderLayout.CENTER);
		add(borderPanel);
		
		label1 = new JLabel();
		label1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		label1.setOpaque(true);
		label1.setBackground(Color.red);
		label1.setForeground(Color.yellow);
		label1.setToolTipText("This is JLabel with text");
		add(label1);
		
		JButton OkButton = new JButton("OK");
		add(OkButton);
		   
		OkButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {  
	 			int id = Integer.parseInt(ftf.getText());
	 			EmployeesDao ed = new EmployeesDao();
	 			System.out.println();
	 			Boolean b = ed.removeEmployees(id);
	 			String s = b.toString();
	 			label1.setText(s);
	         }
		});

	}

}

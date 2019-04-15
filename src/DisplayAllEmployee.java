import java.awt.BorderLayout;
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

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class DisplayAllEmployee extends JPanel {
	
	JTextArea jtAreaOutput;
	String newline = "\n";
	public DisplayAllEmployee() {
	jtAreaOutput = new JTextArea(5, 20);
	jtAreaOutput.setCaretPosition(jtAreaOutput.getDocument().getLength());
	jtAreaOutput.setEditable(false);
	JScrollPane scrollPane = new JScrollPane(jtAreaOutput, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	setLayout(new BorderLayout());
	add(scrollPane, BorderLayout.CENTER);
	
	EmployeesDao ed = new EmployeesDao();
	ArrayList<Employees> al = ed.findAll();
	for (Employees emp : al)
		jtAreaOutput.append(emp + newline);
	
	
}
}






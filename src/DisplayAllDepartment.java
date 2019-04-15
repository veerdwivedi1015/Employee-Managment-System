import java.sql.*;
import java.util.*;
import java.awt.BorderLayout;
import java.io.*;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.vikas.jdbc.Daos.DepartmentDao;
import com.vikas.jdbc.Daos.EmployeesDao;
import com.vikas.jdbc.pojos.Department;
import com.vikas.jdbc.pojos.Employees;
public class DisplayAllDepartment extends JPanel{
	
	JTextArea jtAreaOutput;
	String newline = "\n";
	public DisplayAllDepartment() {
	jtAreaOutput = new JTextArea(5, 20);
	jtAreaOutput.setCaretPosition(jtAreaOutput.getDocument().getLength());
	jtAreaOutput.setEditable(false);
	JScrollPane scrollPane = new JScrollPane(jtAreaOutput, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	setLayout(new BorderLayout());
	add(scrollPane, BorderLayout.CENTER);
	
	DepartmentDao dd = new DepartmentDao();
	ArrayList<Department> al = dd.findAll();
	for (Department dept : al)
		jtAreaOutput.append(dept + newline);
	
	
}

}

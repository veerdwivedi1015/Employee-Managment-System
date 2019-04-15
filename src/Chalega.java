import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.vikas.jdbc.Daos.DepartmentDao;
import com.vikas.jdbc.pojos.Department;

 class Chalega extends JPanel implements ActionListener {

	JButton button1, button2, button3,button4,button5,button6,button7,button8,button9;

	public Chalega() {
		setLayout(new GridLayout(3, 3, 3, 15));
		button1 = new JButton();
		button1.setText("New Dept");
		button1.setActionCommand("button1");
		Icon icon = new ImageIcon(getClass().getResource("/Image/new.jpg"));
		button1.setIcon(icon);
		button1.setBorderPainted(false);
		button1.setFocusPainted(false);
		button1.setContentAreaFilled(false);
		button1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button1.setOpaque(true);
		button1.setBackground(Color.CYAN);
		button1.setForeground(Color.black);
		button1.setToolTipText("Click to add new Department");
		button1.addActionListener(this);
		add(button1);
		
		button2 = new JButton();
		button2.setText("New Emp");
		button2.setActionCommand("button2");
		Icon icon1 = new ImageIcon(getClass().getResource("/Image/new.jpg"));
		button2.setIcon(icon1);
		button2.setBorderPainted(false);
		button2.setFocusPainted(false);
		button2.setContentAreaFilled(false);
		button2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button2.setOpaque(true);
		button2.setBackground(Color.white);
		button2.setForeground(Color.black);
		button2.setToolTipText("Click to add new Employee");
		button2.addActionListener(this);
		add(button2);
		
		button3 = new JButton();
		button3.setText("Display Emp");
		button3.setActionCommand("button3");
		Icon icon3 = new ImageIcon(getClass().getResource("/Image/display.jpg"));
		button3.setIcon(icon3);
		button3.setBorderPainted(false);
		button3.setFocusPainted(false);
		button3.setContentAreaFilled(false);
		button3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button3.setOpaque(true);
		button3.setBackground(Color.CYAN);
		button3.setForeground(Color.black);
		button3.setToolTipText("Click to display all Employee");
		button3.addActionListener(this);
		add(button3);
		
		button4 = new JButton();
		button4.setText("Display Dept");
		button4.setActionCommand("button4");
		Icon icon4 = new ImageIcon(getClass().getResource("/Image/display.jpg"));
		button4.setIcon(icon4);
		button4.setBorderPainted(false);
		button4.setFocusPainted(false);
		button4.setContentAreaFilled(false);
		button4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button4.setOpaque(true);
		button4.setBackground(Color.white);
		button4.setForeground(Color.black);
		button4.setToolTipText("Click to display all Department");
		button4.addActionListener(this);
		add(button4);
		
		button5 = new JButton();
		button5.setText("Edit Emp");
		button5.setActionCommand("button5");
		Icon icon5 = new ImageIcon(getClass().getResource("/Image/edit.jpg"));
		button5.setIcon(icon5);
		button5.setBorderPainted(false);
		button5.setFocusPainted(false);
		button5.setContentAreaFilled(false);
		button5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button5.setOpaque(true);
		button5.setBackground(Color.CYAN);
		button5.setForeground(Color.black);
		button5.setToolTipText("Click to edit Employee details");
		button5.addActionListener(this);
		add(button5);
		
		button6 = new JButton();
		button6.setText("remove Emp");
		button6.setActionCommand("button6");
		Icon icon6 = new ImageIcon(getClass().getResource("/Image/Remove.jpg"));
		button6.setIcon(icon6);
		button6.setBorderPainted(false);
		button6.setFocusPainted(false);
		button6.setContentAreaFilled(false);
		button6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button6.setOpaque(true);
		button6.setBackground(Color.white);
		button6.setForeground(Color.black);
		button6.setToolTipText("Click to remove Employee");
		button6.addActionListener(this);
		add(button6);
		
		button7 = new JButton();
		button7.setText("Search Emp_name");
		button7.setActionCommand("button7");
		Icon icon7 = new ImageIcon(getClass().getResource("/Image/search.jpg"));
		button7.setIcon(icon7);
		button7.setBorderPainted(false);
		button7.setFocusPainted(false);
		button7.setContentAreaFilled(false);
		button7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button7.setOpaque(true);
		button7.setBackground(Color.CYAN);
		button7.setForeground(Color.black);
		button7.setToolTipText("Click to search employee by name");
		button7.addActionListener(this);
		add(button7);
		
		
		button8 = new JButton();
		button8.setText("Search Emp_salary");
		button8.setActionCommand("button8");
		Icon icon8 = new ImageIcon(getClass().getResource("/Image/search.jpg"));
		button8.setIcon(icon8);
		button8.setBorderPainted(false);
		button8.setFocusPainted(false);
		button8.setContentAreaFilled(false);
		button8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button8.setOpaque(true);
		button8.setBackground(Color.white);
		button8.setForeground(Color.black);
		button8.setToolTipText("Click to search employee by salary");
		button8.addActionListener(this);
		add(button8);
		
		button9 = new JButton();
		button9.setText("Search Emp_dept");
		button9.setActionCommand("button9");
		Icon icon9 = new ImageIcon(getClass().getResource("/Image/search.jpg"));
		button9.setIcon(icon9);
		button9.setBorderPainted(false);
		button9.setFocusPainted(false);
		button9.setContentAreaFilled(false);
		button9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button9.setOpaque(true);
		button9.setBackground(Color.CYAN);
		button9.setForeground(Color.black);
		button9.setToolTipText("Click to search employee by Department");
		button9.addActionListener(this);
		add(button9);
	}
		
		public void actionPerformed(ActionEvent ae) {
			String str = ae.getActionCommand();
			if (str.equals("button1")) {
				JFrame f = new JFrame(" AddNewDepartment");
				f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				f.setContentPane(new AddNewDepartment());
				f.setBounds(50,50,300,150);
				f.setVisible(true);
				
				
			}
				
			else if (str.equals("button2")) {
				JFrame f = new JFrame(" AddNewEmployee");
				f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				f.setContentPane(new AddNewEmployee());
				f.setBounds(500,50,300,300);
				f.setVisible(true);

			}
			else if (str.equals("button3")){
				JFrame f = new JFrame(" DisplayAllEmployee");
				f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				f.setContentPane(new DisplayAllEmployee());
				f.setExtendedState(f.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				f.setVisible(true);

			}
				
			else if (str.equals("button4")) {
				JFrame f = new JFrame(" DisplayAllDepartment");
				f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				f.setContentPane(new DisplayAllDepartment());
				f.setExtendedState(f.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				f.setVisible(true);
			}
				
			else if (str.equals("button5")) {
				JFrame f = new JFrame(" ModifyEmployeeDetails");
				f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				f.setContentPane(new ModifyEmployeeDetails());
				f.setBounds(500,50,400,400);
				f.setVisible(true);
			}
		
			else if (str.equals("button6")) {
				JFrame f = new JFrame(" RemoveEmployee");
				f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				f.setContentPane(new RemoveEmployee());
				f.setBounds(500,300,100,105);
				f.setVisible(true);
			}
			else if (str.equals("button7")) {
				JFrame f = new JFrame(" SearchEmployeeByName");
				f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				f.setContentPane(new SearchEmployeeByName());
				f.setExtendedState(f.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				f.setVisible(true);
			}
			else if (str.equals("button8")) {
				JFrame f = new JFrame(" SearchEmployeeBySalary");
				f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				f.setContentPane(new SearchEmployeeBySalary());
				f.setExtendedState(f.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				f.setVisible(true);
			}
			else if (str.equals("button9")) {
				JFrame f = new JFrame(" SearchEmployeeByDepartment");
				f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				f.setContentPane(new SearchEmployeeByDepartment());
				f.setExtendedState(f.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				f.setVisible(true);
			}
		}
		public void enter() {
			JFrame f = new JFrame("Employee Managment System ");
			f.setContentPane(new Chalega());
			f.setExtendedState(f.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}
}
	


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

import com.vikas.jdbc.Daos.DepartmentDao;
import com.vikas.jdbc.pojos.Department;

public class Login extends JPanel implements ActionListener , Serializable {
	JFormattedTextField ftf1;
	JFormattedTextField ftf2;
	JLabel l1;
	JLabel l2;
	String un;
	String pw;

	public Login() {
		l1 = new JLabel("USERNAME");
		l2 = new JLabel("PASSWORD");
		ftf1 = new JFormattedTextField(new String());
		ftf2 = new JFormattedTextField(new String());
		un = new String("admin");
		pw = new String("1234");
		setLayout(new GridLayout(3, 2, 3, 3));
		add(l1);
		add(ftf1);
		add(l2);
		add(ftf2);
		JButton login = new JButton("LOGIN");
		login.setActionCommand("login");
		add(login);
		login.addActionListener(this);
	}
			public void actionPerformed(ActionEvent e) {
				try {
				String unm = ftf1.getText();
				String pwm = ftf2.getText();
				if ((unm.equals(un)) && (pwm.equals(pw))) {
					Chalega ch = new Chalega();
					ch.enter();
					
				}
				else
					JOptionPane.showMessageDialog(this, "Please Enter valid username and password", "Login", JOptionPane.INFORMATION_MESSAGE);	
			  }catch (Exception ex) {
	        		JOptionPane.showMessageDialog(this, "Please Enter valid Data", "Login", JOptionPane.INFORMATION_MESSAGE);
	         }
			}

	public  void login() {
		JFrame f = new JFrame("LOGIN ");
		f.setContentPane(new Login());
		f.setBounds(500,50,300,100);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	}

}

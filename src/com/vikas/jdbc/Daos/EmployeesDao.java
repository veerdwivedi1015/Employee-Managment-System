package com.vikas.jdbc.Daos;

import com.vikas.jdbc.utilities.MyDataBaseConnection;
import com.vikas.jdbc.pojos.*;
import com.vikas.jdbc.utilities.Dateutilities;

import java.sql.*;
import java.util.*;
import java.io.*;
import java.util.Date;

public class EmployeesDao implements Serializable {

	public boolean createEmployees(Employees employees) {
		Connection conn = MyDataBaseConnection.getConnection();
		try {
			String sql = "insert into employees (empname, " + "deptid, designation, doj, salary) values(?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,employees.getEmpName());
			ps.setInt(2,employees.getDeptid());
			ps.setString(3,employees.getDesignation());
			java.sql.Date dt = new java.sql.Date(employees.getDoj().getTime());
			ps.setDate(4,dt);
			ps.setInt(5,employees.getSalary());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
			return false;
		}
		return true;
		
	}
	
	public boolean editEmployees(Employees employees) {
		Connection conn = MyDataBaseConnection.getConnection();
		try {
			String sql = "update employees set empname = ? ," + "deptid = ?, designation = ?, doj = ?, salary = ? where empid = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,employees.getEmpName());
			ps.setInt(2,employees.getDeptid());
			ps.setString(3, employees.getDesignation());
			java.sql.Date dt = new java.sql.Date(employees.getDoj().getTime());
			ps.setDate(4,dt);
			ps.setInt(5,employees.getSalary());
			ps.setInt(6,employees.getEmpId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
			return false;
		}
		return true;
	}
	
	public boolean removeEmployees(int id) {
		Connection conn = MyDataBaseConnection.getConnection();
		try {
			String sql = "delete from employees where empid = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to remove." + sq);
			return false;
		}
		return true;
	}
	
	public Employees findEmployees(int id) {
		Connection conn = MyDataBaseConnection.getConnection();
		Employees employees = new Employees();
		try {
			String sql = "select * from employees where empid = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				employees.setEmpId(id);
				employees.setEmpName(rs.getString("empname"));
				employees.setDesignation(rs.getString("designation"));
				employees.setDeptid(rs.getInt("deptid"));
				java.sql.Date dt = rs.getDate("doj");
				employees.setDoj(new java.util.Date(dt.getTime()));
				employees.setSalary(rs.getInt("salary"));
				
			} 
		}catch (SQLException sq) {
				System.out.println("Unable to fetch row." + sq);
			}
			return employees;
		}
	public ArrayList<Employees> findAll() {
		Connection conn = MyDataBaseConnection.getConnection();
		ArrayList<Employees> listEmployees = new ArrayList<Employees>();
		//Employees employees = new Employees();
		try {
			String sql = "select * from employees ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employees employees = new Employees();
				employees.setEmpId(rs.getInt("empid"));
				employees.setEmpName(rs.getString("empname"));
				employees.setDesignation(rs.getString("designation"));
				employees.setDeptid(rs.getInt("deptid"));
				java.sql.Date dt = rs.getDate("doj");
				employees.setDoj(new java.util.Date(dt.getTime()));
				employees.setSalary(rs.getInt("salary"));
				listEmployees.add(employees);
				
			}
		}catch (SQLException sq) {
			System.out.println("Unable to fetch rows.");
		}
		return listEmployees;
	}
	
	public  ArrayList<Employees> getEmployeesWithDeptId(int id) {
		Connection conn = MyDataBaseConnection.getConnection();
		ArrayList<Employees> listEmployees = new ArrayList<Employees>();
		try {
			String sql = "Select * from employees where deptid like ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employees employees = new Employees();
				employees.setEmpId(rs.getInt("empid"));
				employees.setEmpName(rs.getString("empname"));
				employees.setDesignation(rs.getString("designation"));
				employees.setDeptid(id);
				java.sql.Date dt = rs.getDate("doj");
				employees.setDoj(new java.util.Date(dt.getTime()));
				employees.setSalary(rs.getInt("salary"));
				listEmployees.add(employees);
		}
		}catch (SQLException sq) {
			System.out.println("Unable to fetch rows.");
		}
		return listEmployees;
	}
	
	public  ArrayList<Employees> getEmployeesWithByName(String name) {
		Connection conn = MyDataBaseConnection.getConnection();
		ArrayList<Employees> listEmployees = new ArrayList<Employees>();
		try {
			String sql = "Select * from employees where empname like ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employees employees = new Employees();
				employees.setEmpId(rs.getInt("empid"));
				employees.setEmpName(name);
				employees.setDesignation(rs.getString("designation"));
				employees.setDeptid(rs.getInt("deptid"));
				java.sql.Date dt = rs.getDate("doj");
				employees.setDoj(new java.util.Date(dt.getTime()));
				employees.setSalary(rs.getInt("salary"));	
				listEmployees.add(employees);
		}
		}catch (SQLException sq) {
			System.out.println("Unable to fetch rows.");
		}
		return listEmployees;
	}
	
	public  ArrayList<Employees> getEmployeesWithByDesignation(String Designation) {
		Connection conn = MyDataBaseConnection.getConnection();
		ArrayList<Employees> listEmployees = new ArrayList<Employees>();
		try {
			String sql = "Select * from employees where designation like ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,Designation);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employees employees = new Employees();
				employees.setEmpId(rs.getInt("empid"));
				employees.setEmpName(rs.getString("empname"));
				employees.setDesignation(Designation);
				employees.setDeptid(rs.getInt("deptid"));
				java.sql.Date dt = rs.getDate("doj");
				employees.setDoj(new java.util.Date(dt.getTime()));
				employees.setSalary(rs.getInt("salary"));	
				listEmployees.add(employees);
		}
		}catch (SQLException sq) {
			System.out.println("Unable to fetch rows.");
		}
		return listEmployees;
	}
	
	public  ArrayList<Employees> getEmployeesWithBySalary(int minsalary, int maxsalary) {
		Connection conn = MyDataBaseConnection.getConnection();
		ArrayList<Employees> listEmployees = new ArrayList<Employees>();
		try {
			String sql = "Select * from employees where salary like ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,minsalary);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employees employees = new Employees();
				employees.setEmpId(rs.getInt("empid"));
				employees.setEmpName(rs.getString("empname"));
				employees.setDesignation(rs.getString("designation"));
				employees.setDeptid(rs.getInt("deptid"));
				java.sql.Date dt = rs.getDate("doj");
				employees.setDoj(new java.util.Date(dt.getTime()));
				employees.setSalary(rs.getInt("salary"));
				listEmployees .add(employees);
		}
			String sql1 = "Select * from employees where salary like ? ";
			ps = conn.prepareStatement(sql1);
			ps.setInt(1,maxsalary);
			 rs = ps.executeQuery();
			 while(rs.next()) {
					Employees employees = new Employees();
					employees.setEmpId(rs.getInt("empid"));
					employees.setEmpName(rs.getString("empname"));
					employees.setDesignation(rs.getString("designation"));
					employees.setDeptid(rs.getInt("deptid"));
					java.sql.Date dt = rs.getDate("doj");
					employees.setDoj(new java.util.Date(dt.getTime()));
					employees.setSalary(rs.getInt("salary"));
					listEmployees .add(employees);
			}
		}catch (SQLException sq) {
			System.out.println("Unable to fetch rows.");
		}
		return listEmployees;
	}
	
	public static void main(String args[]) {
		java.util.Date dt = Dateutilities.convertDate("23-10-2015");
		Employees emp = new Employees("vikas",2,"CEO",dt,40000);
		EmployeesDao ed =  new EmployeesDao();
		System.out.println(ed.createEmployees(emp));
		
	}
}
	


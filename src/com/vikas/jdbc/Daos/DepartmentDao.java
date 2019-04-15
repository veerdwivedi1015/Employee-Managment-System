package com.vikas.jdbc.Daos;

import com.vikas.jdbc.utilities.MyDataBaseConnection;
import com.vikas.jdbc.pojos.*;

import java.sql.*;
import java.util.*;
import java.io.*;

public class DepartmentDao implements Serializable {

	public boolean createDepartment(Department department) {
		Connection conn = MyDataBaseConnection.getConnection();
		try {
			String sql = "insert into department (deptname, " + "deptdetails) values(?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,department.getDeptName());
			ps.setString(2,department.getDeptDetails());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
			return false;
		}
		return true;
		
	}
	
	public boolean editDepartment(Department department) {
		Connection conn = MyDataBaseConnection.getConnection();
		try {
			String sql = "update department set deptname = ? ," + "deptdetails = ? where deptid = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,department.getDeptName());
			ps.setString(2,department.getDeptDetails());
			ps.setInt(3, department.getDeptId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
			return false;
		}
		return true;
	}
	
	public boolean removeDepartment(int id) {
		Connection conn = MyDataBaseConnection.getConnection();
		try {
			String sql = "delet from department where deptid = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
			return false;
		}
		return true;
	}
	
	public Department findDepartment(int id) {
		Connection conn = MyDataBaseConnection.getConnection();
		Department department = new Department();
		try {
			String sql = "select * from department where deptid = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				department.setDeptId(id);
				department.setDeptName(rs.getString("deptname"));
				department.setDeptDetails(rs.getString("deptdetails"));
				
			} 
		}catch (SQLException sq) {
				System.out.println("Unable to fetch row." + sq);
			}
			return department;
		}
	public ArrayList<Department> findAll() {
		Connection conn = MyDataBaseConnection.getConnection();
		ArrayList<Department> listDepartment = new ArrayList<Department>();
		//Department department = new Department();
		try {
			String sql = "select * from department ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Department department = new Department();
				department.setDeptId(rs.getInt("deptid"));
				department.setDeptName(rs.getString("deptname"));
				department.setDeptDetails(rs.getString("deptdetails"));
				listDepartment.add(department);
			}
		}catch (SQLException sq) {
			System.out.println("Unable to fetch rows.");
		}
		return listDepartment;
	}
	
	public int getDepartmentId(String name) {
		Connection conn = MyDataBaseConnection.getConnection();
		Department department = new Department();
		try {
			String sql = "select * from department where deptname = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,name);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				department.setDeptId(rs.getInt("deptid"));
			}
		}catch (SQLException sq) {
			System.out.println("Unable to fetch rows.");
		}
		return(department.getDeptId());
	}
}
	


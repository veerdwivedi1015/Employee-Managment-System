package com.vikas.jdbc.pojos;
import java.util.Date;

public class Employees {

	protected int empId;
	protected String empName;
	protected int deptid;
	protected String designation;
	protected Date doj;
	protected int salary;
	
	public Employees(String empName, int deptid, String designation, Date doj, int salary) {
		super();
		this.empName = empName;
		this.deptid = deptid;
		this.designation = designation;
		this.doj = doj;
		this.salary = salary;
	}
	
	public Employees() {
		
		empName = new String();
		designation = new String();
		doj = new Date();
		salary = 0;
	}
	
	public Employees(int deptid, String designation, Date doj, int salary) {
		
		this.deptid = deptid;
		this.designation = designation;
		this.doj = doj;
		this.salary = salary;
	}

	public Employees(int empId, String empName, int deptid, String designation, Date doj, int salary) {
		
		this.empId = empId;
		this.empName = empName;
		this.deptid = deptid;
		this.designation = designation;
		this.doj = doj;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "EmployeesPOJOS [empId=" + empId + ", empName=" + empName + ", deptid=" + deptid + ", designation="
				+ designation + ", doj=" + doj + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deptid;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((doj == null) ? 0 : doj.hashCode());
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		if (deptid != other.deptid)
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (doj == null) {
			if (other.doj != null)
				return false;
		} else if (!doj.equals(other.doj))
			return false;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employees(Date doj, int salary) {

		this.doj = doj;
		this.salary = salary;
	}

}

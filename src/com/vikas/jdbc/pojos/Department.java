package com.vikas.jdbc.pojos;


public class Department {

	protected int deptId;
	protected String deptName;
	protected String deptDetails;
	
	public Department() {
		
		deptId = 0;
		deptName = new String();
		deptDetails = new String();
	}
	
	public Department(String deptName, String deptDetails) {
		
		deptId = 0;
		this.deptName = deptName;
		this.deptDetails = deptDetails;
	}
	
	public Department(int deptId, String deptName, String deptDetails) {
		
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptDetails = deptDetails;
	}

	@Override
	public String toString() {
		return "DepartmentPOJOS [deptId=" + deptId + ", deptName=" + deptName + ", deptDetails=" + deptDetails + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptDetails == null) ? 0 : deptDetails.hashCode());
		result = prime * result + deptId;
		result = prime * result + ((deptName == null) ? 0 : deptName.hashCode());
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
		Department other = (Department) obj;
		if (deptDetails == null) {
			if (other.deptDetails != null)
				return false;
		} else if (!deptDetails.equals(other.deptDetails))
			return false;
		if (deptId != other.deptId)
			return false;
		if (deptName == null) {
			if (other.deptName != null)
				return false;
		} else if (!deptName.equals(other.deptName))
			return false;
		return true;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptDetails() {
		return deptDetails;
	}

	public void setDeptDetails(String deptDetails) {
		this.deptDetails = deptDetails;
	}
}

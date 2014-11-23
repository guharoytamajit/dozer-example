package model;

import java.util.Date;

public class EmployeeDetails<E> {
	int eid;
	E name;
	AddressDetail addressDetail;
	Date dob;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public E getName() {
		return name;
	}

	public void setName(E name) {
		this.name = name;
	}

	public EmployeeDetails() {
		super();
	}

	public AddressDetail getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(AddressDetail addressDetail) {
		this.addressDetail = addressDetail;
	}

	public EmployeeDetails(int eid, E name, AddressDetail addressDetail,
			Date dob) {
		super();
		this.eid = eid;
		this.name = name;
		this.addressDetail = addressDetail;
		this.dob = dob;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}

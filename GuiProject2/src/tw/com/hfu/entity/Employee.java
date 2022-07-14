/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.com.hfu.entity;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Employee {
	private int eid;
	private String eName;
	private String eAge;
	private String eEmail;
	private String eAddress;
	private String eTel;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteAge() {
		return eAge;
	}

	public void seteAge(String eAge) {
		this.eAge = eAge;
	}

	public String geteEmail() {
		return eEmail;
	}

	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;

	}

	public String geteAddress() {
		return eAddress;
	}

	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}

	public String geteTel() {
		return eTel;
	}

	public void seteTel(String eTel) {
		this.eTel = eTel;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", eAge=" + eAge + ", eEmail=" + eEmail + ", eAddress="
				+ eAddress + ", eTel=" + eTel + "]";
	}

}

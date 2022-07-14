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
	private String eNumerId;
	private String eNumberName;
	private int eNumberAge;
	private String eNumberEmail;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteNumerId() {
		return eNumerId;
	}

	public void seteNumerId(String eNumerId) {
		this.eNumerId = eNumerId;
	}

	public String geteNumberName() {
		return eNumberName;
	}

	public void seteNumberName(String eNumberName) {
		this.eNumberName = eNumberName;
	}

	public int geteNumberAge() {
		return eNumberAge;
	}

	public void seteNumberAge(int eNumberAge) {
		if (eNumberAge < 1 || eNumberAge > 150) {
			System.out.println("Input Error");
		} else {
			this.eNumberAge = eNumberAge;
		}
	}

	public String geteNumberEmail() {
		return eNumberEmail;
	}

	public void seteNumberEmail(String eNumberEmail) {
		//if(eNumberEmail=="*@*") {
		this.eNumberEmail = eNumberEmail;
		//}else {
		//System.out.println("Input Error");
		//}
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eNumerId=" + eNumerId + ", eNumberName=" + eNumberName + ", eNumberAge="
				+ eNumberAge + ", eNumberEmail=" + eNumberEmail + "]";
	}

}

package com.beans;

import java.io.Serializable;

public class Visitor implements Serializable {
	private int flatNo;
	private String visitorName;
	private String visitorContact;
	private String purposeOfVisit;
	private VisitorStatus statusOfVisit;
		
	public Visitor(int flatNo, String visitorName, String visitorContact, String purposeOfVisit) {
		super();
		this.flatNo = flatNo;
		this.visitorName = visitorName;
		this.visitorContact = visitorContact;
		this.purposeOfVisit = purposeOfVisit;
		this.statusOfVisit = VisitorStatus.PENDING;  // default status
	}

	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getVisitorContact() {
		return visitorContact;
	}

	public void setVisitorContact(String visitorContact) {
		this.visitorContact = visitorContact;
	}

	public String getPurposeOfVisit() {
		return purposeOfVisit;
	}

	public void setPurposeOfVisit(String purposeOfVisit) {
		this.purposeOfVisit = purposeOfVisit;
	}

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	public VisitorStatus getStatusOfVisit() {
		return statusOfVisit;
	}

	public void setStatusOfVisit(VisitorStatus statusOfVisit) {
		this.statusOfVisit = statusOfVisit;
	}

	@Override
	public String toString() {
		return "Visitor [flatNo=" + flatNo + ", visitorName=" + visitorName + ", visitorContact=" + visitorContact
				+ ", purposeOfVisit=" + purposeOfVisit + ", statusOfVisit=" + statusOfVisit + "]";
	}
}

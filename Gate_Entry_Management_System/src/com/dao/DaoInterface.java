package com.dao;

public interface DaoInterface {

	void requestEntry(int flatNo, String visitorName, String visitorContact, String purposeOfVisit);
	
	void approveEntry(int flatno_ToApprove, String visitorname_ToApprove);

	void viewVisitorHistory(int historyofvisitors_ByFlat);

	void viewAllVisitors();	
}

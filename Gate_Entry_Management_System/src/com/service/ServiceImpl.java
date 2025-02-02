package com.service;

import java.util.Scanner;
import com.dao.*;

public class ServiceImpl implements ServiceInterface{
	Scanner sc_service = new Scanner(System.in);
	
	private final DaoInterface daoInstance = DaoImpl.getInstanceof_Dao();
	
	@Override
	public void request_Entry_For_Visitor() {
		System.out.println("Enter Flat No the visitor wants to visit: ");
		int flatNo = sc_service.nextInt();
		
		System.out.println("Enter visitor's name: ");
		String visitorName = sc_service.next();
		
		System.out.println("Enter visitor's contact number: ");
		String visitorContact = sc_service.next();
		
		System.out.println("Enter purporse of visit: ");
		String purposeOfVisit = sc_service.next();
		
		daoInstance.requestEntry(flatNo,visitorName,visitorContact,purposeOfVisit);
		
	}

	@Override
	public void approve_Entry_For_Visitor() {
		System.out.println("Enter Flat No to approve the request: ");
		int flatno_ToApprove = sc_service.nextInt();
		
		System.out.println("Enter Visitor's Name: ");
		String visitorname_ToApprove = sc_service.next();
		
		daoInstance.approveEntry(flatno_ToApprove,visitorname_ToApprove);	
	}

	@Override
	public void view_Visitor_History() {
		daoInstance.viewAllVisitors();	
	}

	@Override
	public void view_Visitors_Byflat() {
		 System.out.print("Enter Flat No to View History of Visitors: ");
         int flatno_forHistory = sc_service.nextInt();
         daoInstance.viewVisitorHistory(flatno_forHistory);	
	}

}

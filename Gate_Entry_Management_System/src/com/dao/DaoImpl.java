package com.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.beans.Visitor;
import com.beans.VisitorStatus;
import com.service.ServiceImpl;
import com.service.ServiceInterface;

public class DaoImpl implements DaoInterface{
	Scanner sc_dao = new Scanner(System.in);
	
	private static Visitor visitor;
	private static DaoImpl instanceof_DaoImpl;
	private final String file = "Visitor_Data.dat";
	
	public static DaoImpl getInstanceof_Dao(){
		if(instanceof_DaoImpl == null) {
			instanceof_DaoImpl = new DaoImpl();
		}
		return instanceof_DaoImpl;
	}

	public void requestEntry(int flatNo, String visitorName, String visitorContact, String purposeOfVisit) {
		visitor = new Visitor(flatNo,visitorName,visitorContact,purposeOfVisit);
		try(ObjectOutputStream outputstreamInstance = new ObjectOutputStream(new FileOutputStream(file))){
			outputstreamInstance.writeObject(visitor);
			System.out.println("Entry requested for the visitor");
		} 
		catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	@Override
	public void approveEntry(int flatno_ToApprove, String visitorname_ToApprove) {
		if(visitor.getVisitorName().equalsIgnoreCase(visitorname_ToApprove)){
			System.out.println("Are you sure you want to approve the visitor? y/n");
			String status = sc_dao.nextLine();
			
			if(status.equalsIgnoreCase("y")) {
				List <Visitor> listofVisitor = new ArrayList<>();
				
				try(ObjectInputStream inputInstance = new ObjectInputStream(new FileInputStream(file))){
					visitor = (Visitor) inputInstance.readObject();		
					listofVisitor.add(visitor);
					
					 
						if(visitor.getVisitorName().equalsIgnoreCase(visitorname_ToApprove) && (visitor.getFlatNo() == flatno_ToApprove)) {
							visitor.setStatusOfVisit(VisitorStatus.APPROVED);
							
							try(ObjectOutputStream outputInstance = new ObjectOutputStream(new FileOutputStream(file))){
								outputInstance.writeObject(visitor);
								System.out.println("Visitor Approved!");
							}			
						}
				}  
				catch (FileNotFoundException e) {
					e.printStackTrace();
				} 
				catch (IOException e) {
					e.printStackTrace();
				} 
				catch (ClassNotFoundException e) {
					e.printStackTrace();
					}			
				}				
		else if(status.equalsIgnoreCase("n")) {
			visitor.setStatusOfVisit(VisitorStatus.REJECTED);
			try(ObjectOutputStream outputInstance = new ObjectOutputStream(new FileOutputStream(file))){
				outputInstance.writeObject(visitor);
				System.out.println("Visitor Rejected!");	
			} 
			catch (IOException e) {
				e.printStackTrace();
				}			
			}
		}
		else{		
			System.out.println("New Visitor");
			System.out.println("Do you want to request entry for new visitor? y/n");
			String status1 = sc_dao.nextLine();
			
			if(status1.equalsIgnoreCase("y")) {
				ServiceInterface serviceImpl = new ServiceImpl();
				serviceImpl.request_Entry_For_Visitor();
			}
			else {
				System.out.println("New visitor rejected!");
			}
		} 	
	}

	@Override
	public void viewAllVisitors() {
		List <Visitor> allVisitors_List = new ArrayList<>();
		
		try(ObjectInputStream inputstreamInstance = new ObjectInputStream(new FileInputStream(file))){
			visitor = (Visitor) inputstreamInstance.readObject();
			
			allVisitors_List.add(visitor);
			
			for(Visitor v1 : allVisitors_List) {
				System.out.println(v1);
			}
			
		} 
		catch (FileNotFoundException e) {			
			System.out.println("File Not Found");
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Class Not Found");
		}		
	}
	
	@Override
	public void viewVisitorHistory(int flatno_forHistory) {
		List <Visitor> visitors_list = new ArrayList<>();
		
		try(ObjectInputStream inputstreamInstance = new ObjectInputStream(new FileInputStream(file))){
			visitor = (Visitor) inputstreamInstance.readObject();
			
			if(visitor.getFlatNo() == flatno_forHistory) {
				visitors_list.add(visitor);
				
				for(Visitor v : visitors_list) {
					System.out.println(v);
				}
			}
			else {
				System.out.println("No visitors found for this flat");
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Class Not Found");
		}		
	}
}

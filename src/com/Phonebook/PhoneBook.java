package com.Phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {
	public static void main(String args[]) throws ClassException {
		List<Contact> PhoneBook = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Choose among following : ");
			System.out.println("1. Add Contact ");
			System.out.println("2. Search Contact");
			System.out.println("3. Update Contact");
			System.out.println("4. Delete Contact");
			
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			try {
			switch(choice) {
			case 1: 
				
				System.out.println("Enter name: ");
				String Name= sc.nextLine();
				System.out.println("Enter Phone Number: ");
				String PhoneNumber=sc.nextLine();
				if (!PhoneNumber.matches("\\d+")) {
					throw new ClassException("Phone Number Should contain digits only");
				}
				if (PhoneNumber.length()!=10) {
					throw new ClassException("Phone Number must contains 10 digits only");
				}
				
				Contact con = new Contact(Name, PhoneNumber);
				PhoneBook.add(con);
				
				System.out.println("Contact Added Successfully!!");
				break;
			
			case 2:
				
				System.out.println("Enter Contact Name: ");
				String SearchName= sc.nextLine();
				
				for (Contact c: PhoneBook) {
					if(c.getName().contains(SearchName)) {
						System.out.println("Name: "+ c.getName() + "Phone Number: "+ c.getPhoneNumber());
					}
				}
				break;
			
			case 3: 
				System.out.println("Update Contact  ");
				System.out.println("Search Contact Name you want to Update: ");
				String Name1= sc.nextLine();
				
				if(PhoneBook.isEmpty()) {
					System.out.println("Phone Book is Empty, Please add some contact. ");
					return;
				}
				for(Contact c: PhoneBook) {
					if(c.getName().equals(Name1)) {
						System.out.println("Enter new Phone Number");
						String PhoneNumber1 = sc.next();
						if (!PhoneNumber1.matches("\\d+")) {
							throw new ClassException("Phone Number Should contain digits only");
						}
						if (PhoneNumber1.length()!=10) {
							throw new ClassException("Phone Number must contains 10 digits only");
						}
						c.setPhoneNumber(PhoneNumber1);
						System.out.println("Contact Updated");
						return ;
						}
					}
				System.out.println("Contact not found in Phone Book");
				break;
				
			case 4:
				
				System.out.println("Delete Contact Info");
				System.out.println("Enter Contact name you want to delete: " );
				String DeleteName = sc.nextLine();
				if(PhoneBook.isEmpty()) {
					System.out.println("PhoneBook is empty. Please insert records first.");
					return;
				}
				for(Contact c : PhoneBook) {
					if(c.getName().equals(DeleteName)) {
						PhoneBook.remove(c);
						System.out.println("contact deleted");
						return;
					}
				}
				
				System.out.println("Contact not found in Phone Book");
				sc.close();
			}
			}catch(ClassException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

package com.training.org;

import java.util.ArrayList;
import java.util.Scanner;

public class XYZOrg {
	
	public static void main(String[] args) {
		
		StackSalesEmployee myStack =new StackSalesEmployee();
		SalesEmployee s1=new SalesEmployee(101,"EShan",10000,5000);
		s1.CalculateSal();
		
		SalesEmployee s2=new SalesEmployee(102,"Tanish",20000,5656);
		s2.CalculateSal();
		
		SalesEmployee s3=new SalesEmployee(103,"Manish",30000,3456);
		s3.CalculateSal();
		
		
		SalesEmployee s4= new SalesEmployee(104,"Kanish",40000,6656);
		s4.CalculateSal();
				
		SalesEmployee s5=new SalesEmployee(105,"Vanish",50000,4544);
		s5.CalculateSal();
		//StackSalesEmployee s1 =new StackSalesEmployee(1,"ayesha",10,20);
		
		myStack.push(s1);
		myStack.push(s2);
		myStack.push(s3);
		myStack.push(s4);
		myStack.push(s5);
		
		
		System.out.println(myStack.pop());
	
//        SalesEmployee se1=new SalesEmployee(101,"Eshan",10000,5000);
//		
//		System.out.println(se1);
		
//		ArrayList<Employee>empList=new ArrayList<Employee>();
//		Scanner input=new Scanner(System.in);
//		int flag = 0;
//		char ch;
//		do {
//			System.out.println("1]Add new record:\2]Display Record\3]Delete record\n4]Update Record");
//			int choice=input.nextInt();
//			int flag1 = 0;
//			switch(choice) {
//			case 1:
//				System.out.println("Enter empId:");
//				int id=input.nextInt();
//				System.out.println("Enter name:");
//				String name=input.next();
//				System.out.println("Enter salary:");
//				double sal=input.nextDouble();
//				
//		
//				empList.add(new Employee(id,name,sal));
//				System.out.println("Record is added successfully....");
//		break;
//				
//			case 2:
//				System.out.println("**********Emplpoyee records are***********");
//				System.out.println("--------------------------------------------------------------------");
//
//				for(Employee emp:empList) {
//					System.out.println(emp);
//				}
//				System.out.println("--------------------------------------------------------------------");
//				break;
//				
//			case 3:
//				System.out.println("Enter the name to delete");
//				String nm=input.next();
//				for(int i=0;i<empList.size(); i++) {
//					if(empList.get(i).getEmpName().equals(nm)) {
//						empList.remove(i);
//						System.out.println("Record successfully deleted...");
//						flag=1;
//						break;
//					}
//				}
//				if(flag==0) {
//					System.out.println("Record is not available....");
//		
//				}
//				break;
//				
//			case 4:
//				System.out.println("4.1]Update Name\n4.2]Update salary\n\n");
//				int choice1=input.nextInt();
//				switch(choice1) {
//				case 1:
//					System.out.println("Enter the old name to replace");
//					String nmOld=input.next();
//					for(int i=0; i<empList.size();i++) {
//						System.out.println("Enter new name to replace with"+ nmOld+" name");
//						String nmNew=input.next();
//						empList.get(i).setEmpName(nmNew);
//						System.out.println("Updated name succcessfully...");
//						flag1=0;
//						break;
//					}
//					
//				
//				if(flag1==0)
//					System.out.println("Record not found for deletion....");
//				break;
//				
//			   case 2:
//				System.out.println("provide yearly increment for employee with condition ");
//				
//				System.out.println("Enter the salary for condition...");
//				int checkSal=input.nextInt();
//				
//				System.out.println("Enter increment percentage:");
//				double incrementPer=input.nextDouble();
//				
//				for(int i=0;i<empList.size(); i++) {
//					if(empList.get(i).getSalary()<checkSal) {
//						empList.get(i).setSalary(empList.get(i).getSalary()*(incrementPer/100+1));
//					}
//				}
//				}
//				break;
//				
//				
//			default:
//					System.out.println("Invalid Choice....");
//					break;
//				
//			}
//			System.out.println("Do you want to continue....");
//			ch=input.next().charAt(0);
//		}while(ch=='y'||ch=='Y');
//		System.out.println("I'am done");
//		
//		
		
//		Employee e1=new Employee();
//		System.out.println(e1);
//		
//		Employee e2=new Employee(101,"Nilam",10000);
//		System.out.println(e2);
	
		}
	

}

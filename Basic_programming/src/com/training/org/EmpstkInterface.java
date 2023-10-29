package com.training.org;

public interface EmpstkInterface {
	void push(SalesEmployee se1);
	SalesEmployee pop();
	

}
//class StackSalesEmployee implements EmpstkInterface{
//	private SalesEmployee stk[ ];
//    private int top;
//    private int sales;
//	
//	private int empId;
//	private String empName;
//	private double salary;
//	
//    StackSalesEmployee()
//    {
//    	System.out.println("default constructor of sales employee is called");
//        stk=new SalesEmployee[0];
//        top=0;
//}
//    public StackSalesEmployee(int empId,String empName,double salary,int sales) {
//		
//		System.out.println("Parameterized constructor of SalesEmployee is called");
//		this.empId = empId;
//		this.empName = empName;
//		this.salary = salary;
//		
//	}
//    
//    public StackSalesEmployee(int size) {
//    	System.out.println("parameterized ");
//    	stk=new SalesEmployee[size];
//        top=0;
//    }
//	@Override
//	public void push(SalesEmployee se1) {
//		if(top==stk.length-1)
//        {
//                System.out.println("Stack Overflows");
//                
//        }
//        else
//                stk[++top]=se1;
//		
//	}
//
//	@Override
//	public SalesEmployee pop() {
//		if(top<0) {
//			System.out.println("stack underflow");
//		return null;
//		}
//		else 
//			return stk[top--];
//	}
//	
//	
//public static void main(String[] args) {
//		
//		StackSalesEmployee myStack =new StackSalesEmployee(10);
//		SalesEmployee s1=new SalesEmployee(101,"EShan",10000,5000);
//		s1.CalculateSal();
//		
//		SalesEmployee s2=new SalesEmployee(102,"Tanish",20000,5656);
//		s2.CalculateSal();
//		
//		SalesEmployee s3=new SalesEmployee(103,"Manish",30000,3456);
//		s3.CalculateSal();
//		
//		
//		SalesEmployee s4= new SalesEmployee(104,"Kanish",40000,6656);
//		s4.CalculateSal();
//				
//		SalesEmployee s5=new SalesEmployee(105,"Vanish",50000,4544);
//		s5.CalculateSal();
//		//StackSalesEmployee s1 =new StackSalesEmployee(1,"ayesha",10,20);
//		
//		myStack.push(s1);
//		myStack.push(s2);
//		myStack.push(s3);
//		myStack.push(s4);
//		myStack.push(s5);
//		
//		
//		System.out.println(myStack.pop());
//   }
//}

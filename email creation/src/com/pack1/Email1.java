package com.pack1;
/**
 * @author PAVAN
 */
import java.util.Scanner;
/*
 * importing the scanner class
 */
public class Email1 {
	Scanner sc = new Scanner(System.in);
	/*
	 * creating the scanner class object
	 * creating private variables for best practice this provides encapsulation
	 */
	
	private String firstname,secondname;
	private String alteranteEmail ="@you.com";
    private String pass1;
    private int mailcapacity = 20;
	private String altpassword = "default123";
	private String compname ="pytech.com";
    private String dep;


		void Email12()//String first name,String second name)
		{
			System.out.println("Email Created:"+" "+  firstname+" "+secondname);
			this.dep = department();

			System.out.println("your mail is :"+firstname.toLowerCase()+secondname.toLowerCase()+"@"+dep+"."+compname);
			pass1 = pass(10);
			System.out.println("your password is : "+pass1);
			show();
			
		}
		void setfirstname(String firstname) {
			this.firstname =firstname;
		}
		void setsecondname(String secondname) {
			this.secondname = secondname;
		}
		void setdep(String dep) {
			this.dep = dep;
		}

		
		String department()	{
			/*
			 * method to choose the department
			 */
			

			System.out.println(" \nDEPARTMENT DETAILS \n\n Enter 1 for Developers \n Enter 2 for It \n Enter 3 for Coustemers \n 0 for none");
			int depchoice = sc.nextInt();
			
			if (depchoice == 1) return "dev";
			else if (depchoice == 2) return "it";
			else if (depchoice == 3) return "cust";
			else  return "";
			
		}
		String pass(int length)
		{
			/*
			 * function to return a random combination of strings and numbers for a secure password
			 */
			String passset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*()";
			char [] password = new char[length];
			for(int i = 0;i<length;i++)
			{
				 int rand =(int)( Math.random()*passset.length());
				 password[i] = passset.charAt(rand);
			}
			return new String(password);
		}

			void show()
			{
				/*
				 * function to print the coustomer details
				 */
				System.out.println("\n\n COUSTERMER DETRAILS\n\n\n Cuostemer name :"+firstname+" "+secondname+"\n Deparetment:"+dep+"\n Mail capacity:"+mailcapacity+" gb");
				System.out.println(" Default mail : "+alteranteEmail+" \n Default password :" + altpassword);
				System.out.println();
			}

			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package com.pack1;
/**
 * @author PAVAN
 */
import java.util.Scanner;
/*
 * importing the scanner class
 */
public class Email extends Email1 //extending the core class
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Email obj = new Email();// creating main core class object
		System.out.print("Enter your first name:");
		obj.setfirstname( sc.nextLine());
		System.out.print("Enter your lastname name:");
		obj.setsecondname( sc.nextLine());
		obj.Email12();
		sc.close();

	}
}

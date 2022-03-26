package com.javaproject;

import java.util.Scanner;

public class ArmstrongNumber {
	void armstrongnumber(){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the number");
	int n=sc.nextInt();

	int n1=n;
	int d,s=0,a=0;
	
	while(n!=0)
	{
		d=n%10;
		s=s+(int)(Math.pow(d, a));
		n=n/10;
	}
	System.out.println("sum of the value"+s);
	
	if(n1==s)
	{
		System.out.println("armstrong number");		

	}
	else
	{
		System.out.println("Not armtrong number");
	}

}
		public static void main(String[] args) {
			ArmstrongNumber n=new ArmstrongNumber();
			n.armstrongnumber();

	
}
		}
		

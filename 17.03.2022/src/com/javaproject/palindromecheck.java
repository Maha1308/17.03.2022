package com.javaproject;

import java.util.Scanner;

public class palindromecheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				int n;
		System.out.println("enter the number");
		n=sc.nextInt();
		sc.close();
		int temp=n;
		int digit=0,sum=0,rev=0;
		while(n>0)
			{
			digit=n%10;
			rev=rev*10+digit;
			sum=sum+digit;
			n=n/10;
			}
		System.out.println(rev);
		if(temp==rev)
		{
			System.out.println("this is palidrome");		

	}
	else
	{
		System.out.println("this not palidrome");
	}
}
}

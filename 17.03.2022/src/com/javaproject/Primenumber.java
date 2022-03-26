package com.javaproject;

import java.util.Scanner;

public class Primenumber {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("enter number");
	n=sc.nextInt();
	sc.close();
	int count=0;
	for(int i=1;i<=n;i++)
	{
		count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(i);
		}
	}
	}
}

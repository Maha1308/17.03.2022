package com.javaproject;

public class example4 {
	

	public static void main(String[] args) {
	int a=1;
		int s=0;
		for(int i=1;i<=6;i++)
		{
			a=1;
			for(int j=1;j<=i;j++)
			{
				a=a*j;
			}
			s=s+a;
		}
		
		
System.out.println("sum of the series="+s);
	}
}

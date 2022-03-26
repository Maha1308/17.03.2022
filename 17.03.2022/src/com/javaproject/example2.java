package com.javaproject;

public class example2 {
	

	public static void main(String[] args) {
		int n=0;
		int a=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				a=a-i;
			}
			else
			{
				a=a+i;
			}
		}
System.out.println("answer="+a);
	}

}

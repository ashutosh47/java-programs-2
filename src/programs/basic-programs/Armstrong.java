package programs;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int n,sum=0,r;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
         n=sc.nextInt();
         int temp=n;
        while(temp!=0)
        {
        	r = temp%10;
        	sum = sum+r*r*r;
        	temp= temp/10;
        }	
           
	if(n==sum)
	{
		System.out.println("nymber is armstrong");
	}
	else
	{
		System.out.println("nymber is  not a armstrong");
	}
	
        
	
	}
}

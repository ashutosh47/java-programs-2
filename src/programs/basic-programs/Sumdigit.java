package programs;
import java.util.Scanner;

public class Sumdigit {

	public static void main(String[] args) {
		int n,sum=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		if(n<0)
		{
			System.out.println("please enter possitive value ");
		}	

		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		  
		  // break;
		}
		 System.out.println(sum);
		
	}// TODO Auto-generated method stub

	}



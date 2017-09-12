package programs;
import java.util.Scanner;
public class Swap {
	

	public static void main(String[] args) {
	int n1,n2,temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the two number");
	n1=sc.nextInt();
	n2=sc.nextInt();
	System.out.println("before swaping n1 :"+n1+" and n2:"+n2);
	temp=n1;
	n1=n2;
	n2=temp;
	System.out.println("after swaping n1  :"+n1+" and n2:"+n2);
	
	

	}

}

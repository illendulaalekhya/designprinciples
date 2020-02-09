package calculator;
import java.util.*;
import Mathop.*;
public class calculatorApplication {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide");
		int c=sc.nextInt();
		System.out.println("enter two numbers");
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		operations op=new operations();
		sc.close();
		switch(c)
			{
		       case 1:op.add(a,b);
		       break;
		       case 2:op.sub(a,b);
		       break;
		       case 3:op.mul(a,b);
		       break;
		       case 4:op.div(a,b);
		       break;
		       default:System.out.println("Invalid choice");
		       
			}
		
	}

}

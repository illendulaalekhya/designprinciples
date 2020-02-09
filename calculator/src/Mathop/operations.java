package Mathop;

public class operations implements Mathoperations{
	public void add(int a,int b) {
		System.out.println("sum of numbers:  "+(a+b));
	}
	public void sub(int a,int b) {
		System.out.println("difference of numbers:  "+(a-b));
	}
	public void mul(int a,int b) {
		System.out.println("product of numbers:  "+(a*b));
	}
	public void div(int a,int b){
		if(b!=0)
			{
				double c;
				c=(double)a/b;
				System.out.println("division of numbers:  "+c);
			}
		else
				System.out.println("Can't divide by zero");
		    }
}

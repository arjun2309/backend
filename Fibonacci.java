package practice1;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	System.out.println("Enter the size");
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	int a=0,b=0,c=1;
	System.out.print(a+",");
	for(int i=1;i<=n;i++) {
		a=b+c;
		b=c;
		c=a;
		
		System.out.print(a);
	}
}
}

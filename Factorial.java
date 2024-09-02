package practice1;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner scanner=new Scanner(System.in);
	int a=scanner.nextInt();
	int i=1;
	int n=1;
	for(  i=1;i<=a;i++){
		n=n*i;
			
	}
	System.out.println(n);
}
}

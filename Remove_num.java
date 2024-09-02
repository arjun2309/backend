package practice1;

import java.util.Scanner;

public class Remove_num {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scanner.nextInt();
		System.out.println("Enter the number in the array ");
		int arr[] =new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("Enter the number to remove ");
		int rem=scanner.nextInt();
		for(int i=0;i<=arr.length;i++) {
			if(rem==arr[i]) {
				
				i++;
			}
	
			System.out.println(arr[i]);
		}
		
		
	}
	
	

}

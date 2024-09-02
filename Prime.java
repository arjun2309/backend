package practice1;

import java.util.Scanner;

public class Prime {
	public static boolean isPrime(int number) {
        // Corner cases
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        if (number == 2 || number == 3) {
            return true; // 2 and 3 are prime numbers
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false; // Multiples of 2 and 3 are not prime
        }

        // Check for factors up to the square root of the number
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false; // Number is divisible by i or i+2
            }
        }
        return true; // No divisors found, number is prime
    }

    public static void main(String[] args) {
    	Scanner scanner =new Scanner(System.in);
     System.out.println("Enter the number");
     int number=scanner.nextInt();
     

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

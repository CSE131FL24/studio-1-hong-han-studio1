package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("First integer: ");
		int n1 = in.nextInt();
		
		System.out.println("Second integer: ");
		int n2 = in.nextInt();
		
		System.out.print("Average of " + n1 + " and " + n2 + " is " + ((double)(n1 + n2)/2) + ".");

	}

}

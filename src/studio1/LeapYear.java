package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		boolean tf1 = year%4==0&&year%100!=0;
		boolean tf2 = year%400==0;
		boolean tf3 = tf1||tf2;
		System.out.print(year + " is a leap year: " + 
		tf3);
	
	}

}

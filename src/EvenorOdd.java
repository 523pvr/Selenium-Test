import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {

		int num;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter num: ");
		num = scn.nextInt();
		if (num%2 == 0) {
			System.out.println("The Given Num is Even");
			
		}
		else { 
			System.out.println("The given Num is Odd");
		}
	}
	
}

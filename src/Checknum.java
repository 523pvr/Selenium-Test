import java.util.Scanner;

public class Checknum {

	public static void main(String[] args) {

		int num;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter num: ");
		num = scn.nextInt();
		if (num < 0 ) {
			
			System.out.println("this is a -Ve num");
		}
		else if (num > 0){
			System.out.println("This is +Ve Num");
			
		}
		
	}

}

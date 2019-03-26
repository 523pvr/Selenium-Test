
public class DuplcaiteChar {

	public static void main(String argu[]) {

		int n1 = 0; 
		int n2 = 1;
		int count=10;
		System.out.println(n1+" "+n2);
		for(int n3=2;n3<count;n3++) {
			n3 = n1 + n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;		
		}
		
		 }
		}



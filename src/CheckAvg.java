
public class CheckAvg {

	public static void main(String[] args) {

		int num[] = {1,2,3,4,5};
		int siz = num.length;
		int total = 0;
		for(int i=0;i<num.length;i++) {
			total = total + num[i];
//			System.out.println(total);

		}
		System.out.println(total);
		int avg = total/siz;
		System.out.println(avg);
	}

}

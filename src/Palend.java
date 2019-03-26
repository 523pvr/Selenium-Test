
public class Palend {
	
	public static void main(String [] args) {
		
		String str= "madam";
		int i2 = str.length();
		String temp = "";
		for(int i=i2-1;i>=0;i--) {
			
		temp  =  temp + str.charAt(i);
		}
	System.out.println(temp);
	
if (str.equals(temp)) {
	System.out.println("its planedrome");
}
else {
	System.out.println("its not a plandrome");
}

}
}
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter a String: ");
	    String s = sc.next();
	    sc.close();
	    
	    String reversed = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        
        System.out.println("Reversed string: " + reversed);	    	    
	}
}

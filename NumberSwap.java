import java.util.Scanner;

public class NumberSwap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter first Number - ");
		int firstNumber =sc.nextInt();
		System.out.printf("Enter second Number - ");
	    int secondNumber = sc.nextInt();
	    sc.close();
	    
	    firstNumber = firstNumber+secondNumber;
	    secondNumber = firstNumber-secondNumber;
	    firstNumber = firstNumber-secondNumber;

	   	System.out.println("Number Swapped:");
	   	System.out.println("FirstNumber: " +firstNumber);
	   	System.out.println("SecondNumber: " +secondNumber);	    	
	}

}

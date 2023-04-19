import java.util.Scanner;

public class KMtoMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter Kilometers - ");
		Double km = sc.nextDouble();
		sc.close();
		
		Double miles = 0.62137119;
		miles = km*miles;
		System.out.printf("Total Miles: " +miles);
	}

}

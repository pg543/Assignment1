import java.util.Scanner;

public class AreaOfTriangle {
	
	public static void RightTriangleArea(float height, float base) {
		float area = (height*base)/2;
		System.out.println("Area of Triangle is " + area);
	}
	
	public static void NonRightTriangleArea(double a, double b, double c) {
		double s = (a + b + c)/2;
		double area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
		System.out.println("Area of Triangle is " + area);		
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		
		System.out.print("Enter sideA - ");  
		int sideA = sc.nextInt();  
		
		System.out.print("Enter sideB - ");  
		int sideB = sc.nextInt(); 
		
		System.out.print("Enter sideC - ");  
		int sideC = sc.nextInt(); 
		
		if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
			System.out.println("InvalidInput. Do not Enter zero.");
		}
			
		else if(sideA >= (sideB+sideC) || sideC >= (sideA+sideB) || sideB >= (sideA+sideC) ) {
			System.out.println("It can not be a Triangle");
		}
		
		else if(sideA==sideB && sideB==sideC) {
			System.out.println("It is an Equilateral Triangle");
			NonRightTriangleArea(sideA , sideB, sideC);
		}
		
		else if (((Math.pow(sideA,2))+(sideB*sideB)) == (sideC*sideC) || ((sideA * sideA) + (sideC * sideC)) == (sideB * sideB) || ((sideC * sideC) + (sideB * sideB)) == (sideA * sideA)) {
			System.out.println("It is a Right Triangle");
			if ((sideA > sideB) || (sideA > sideC)){
				RightTriangleArea(sideB, sideC);				
			}
			else if ((sideB > sideA) || (sideB > sideC)){
				RightTriangleArea(sideA, sideC);
			}
			else if ((sideC > sideA) || (sideC > sideB)){
				RightTriangleArea(sideA, sideB);
			}
		}
		
		else if(sideA != sideB && sideB != sideC && sideA != sideC) {
			System.out.println("It is a Scalene Triangle");
			NonRightTriangleArea(sideA , sideB, sideC);
		}
		
		else if ((sideA==sideB && sideB!=sideC ) || (sideA!=sideB && sideC==sideA) || (sideC==sideB && sideC!=sideA)) {
			System.out.println("It is an Isosceles Triangle");
			NonRightTriangleArea(sideA , sideB, sideC);
		}	
		sc.close();
	}
}

import java.util.*;

public class CalendarDisplay {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {
        	
        	System.out.print("Enter the year: ");
        	int year = sc.nextInt();
        	System.out.print("Enter the month (1-12): ");
        	int month = sc.nextInt();
        
        	Calendar calendar = Calendar.getInstance();
        	calendar.set(year, month - 1, 1);
        
        	System.out.println("  " + calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()) + " " + year);
        	System.out.println(" Su Mo Tu We Th Fr Sa");
        
        	int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        	int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        
        	for (int i = 1; i < firstDayOfWeek; i++) {
        		System.out.print("   ");
        	}
        
        	for (int i = 1; i <= daysInMonth; i++) {
        		if (i < 10) {
        			System.out.print(" ");
        		}
        		System.out.print(" " + i);
        		if ((i + firstDayOfWeek - 1) % 7 == 0) {
        			System.out.println();
        		}
        	}
        	sc.close();
        }
    }
}
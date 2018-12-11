package Package1;
import java.util.Scanner;
public class MealCost 
{
 public static void main(String[] args)
 {
	 Scanner scanner = new Scanner (System.in);
	 double mealCost, totalCost, tip, tip2, tip3,tax, tax2, tax3;
	 System.out.println("Enter the cost of the meal: ");
	 mealCost = scanner.nextDouble(); 
	 System.out.println("How much % do you want to tip?: ");
	 tip=scanner.nextDouble();
	 System.out.println("Enter the Tax %: ");
	 tax=scanner.nextDouble();
	 tip2=(tip*.01);
	 tax2=(tax*.01);
	 tip3= tip2*mealCost;
	 tax3= tax2*mealCost;
	 totalCost=mealCost+tip3+tax3; 
	 System.out.println("Total Meal Cost is: " +totalCost);
 }
}

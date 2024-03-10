import java.util.Scanner;

public class CalorieCalculator {

	public static void main(String[] args) {
		Scanner userInput = new Scanner (System.in);
		int calories = 0;
        String continuing = "yes";

		while  (!continuing.equals("no")){
		System.out.print("\nInput amount of Carbs (g): ");
		int carbs = userInput.nextInt();

		System.out.print("\nInput amount of Protein (g): ");
		int protein = userInput.nextInt();
		
        System.out.print("\nInput amount of Fat (g): ");
		int fat = userInput.nextInt();
		
        calories = fat * 9 + (carbs + protein) * 4;
		
        System.out.println("\nThe total calories are: " + calories + "\n");
        
        System.out.print("Would you Like to input another one (yes/no): ");
        continuing = userInput.next();
        System.out.println("OK!");
	}
}

}

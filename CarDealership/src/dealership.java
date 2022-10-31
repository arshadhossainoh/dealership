import java.util.Scanner;

public class dealership {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our dealership store");
		System.out.println(".Select option 'a' to buy a car");
		System.out.println(".Select option 'b' to sell a car");
		String option = sc.nextLine();
		switch(option) {
		case "a" : 
			System.out.println("\nWhat is your budget?");
			int budget = sc.nextInt();
			if(budget >= 10000) {
				System.out.println("\nGreat, A Nissan Altima is available");
				System.out.println("\nDo you have insurance? 'yes' or 'no'");
				sc.nextLine();
				String insurance = sc.nextLine();
				System.out.println("\nDo you have a license? 'yes' or 'no'");
				String license = sc.nextLine();
				System.out.println("\nWhat is your credit score?");
				int creditscore = sc.nextInt();
				
				if(insurance.equals("yes") && license.equals("yes") && creditscore > 600) {
					System.out.println("Sold! pleasure doing business with you");
				}else {
					System.out.println("We're sorry, you are not eligible");
				}
					
			}else {
				System.out.println("Sorry, we dont sell car under $10000");
			}
			break;
		case "b" : 
			System.out.println("\nwhat is your car valued at?");
			int value = sc.nextInt();
			System.out.println("\nwhat is your selling price?");
			int price = sc.nextInt();
			if(value > price && price < 30000) {
				System.out.println("\nWe will buy your car, pleasure doing business with you");
			}else {
				System.out.println("\nSorry, we are not interested");
			}
			break;
		default : System.out.println("Invalid option");
		}
		sc.close();

	}

}

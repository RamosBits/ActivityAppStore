package ramosstoreapp;

/**
 *
 * @author Ramos
 */
import java.util.Scanner;

public class RamosStoreApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        String again = null;

        do {
            System.out.println("Welcome to the Grands Store");
            System.out.println("Please select your banana strips to purchase:");

            System.out.println("1. Classic - P40");
            System.out.println("2. Cheese - P45");
            System.out.println("3. Sour Cream - P49");
            System.out.println("4. Barbeque - P49");
            System.out.println("5. Spicy Garlic - P55");
            System.out.println("6. Exit");

            System.out.print("Input your desired snack here or press 6 to exit: ");
            int choice = scanner.nextInt();

            String selectFlavor = "";
            double price = 0.0;

            // Mga choices after sa display
            switch (choice) {
                case 1:
                    selectFlavor = "Classic";
                    price = 40.00;
                    break;
                case 2:
                    selectFlavor = "Cheese";
                    price = 45.00;
                    break;
                case 3:
                    selectFlavor = "Sour Cream";
                    price = 49.00;
                    break;
                case 4:
                    selectFlavor = "Barbeque";
                    price = 49.00;
                    break;
                case 5:
                    selectFlavor = "Spicy Garlic";
                    price = 55.00;
                    break;
                case 6:
                    System.out.println("Exiting the Store. Thank you for visiting! ");
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Invalid Choice. Please try again.");
                    continue;
            }

            //Quantity nga pila ka bouk Banana Strips
            if (choice >= 1 && choice <= 5) {
                System.out.println("You selected: " + selectFlavor);
                System.out.print("Input how many ");
                System.out.print(selectFlavor);
                System.out.print(" would you like:");
                int amount = scanner.nextInt();

                //mo multiply based sa gi input sa taas
                double pricetotal = amount * price;
                System.out.println("Your total price is: P" + pricetotal);
                System.out.println("Enter your cash: ");
                double cash = scanner.nextDouble();

                //ang pag check sa kwarta if tama ra or kulang
                if (cash >= pricetotal) {
                    double change = cash - pricetotal;
                    System.out.println("Thank you for purchasing " + selectFlavor + ".");
                    System.out.printf("Your change is: P%.2f\n", change);

                } else {
                    System.out.println("Not enough cash. Transaction cancelled.");
                }
                

            } System.out.print("Would you like to buy again? (Yes/No): ");
            again = scanner.next();
        } while (again.equalsIgnoreCase("Yes"));

        scanner.close();
    }
}

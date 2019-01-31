
import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
    {
        public static void main(String[] args)
        {
            Scanner keyboard = new Scanner(System.in);
            // Ask for three items on grocery list from user.
            out.println("Please list three items on your grocery shopping list.");
            out.print("Item 1? ");
            String itemOne = keyboard.nextLine();
            out.print("\nItem 2? ");
            String itemTwo = keyboard.nextLine();
            out.print("\nItem 3? ");
            String itemThree = keyboard.nextLine();

            //Ask for quantity of the each item from user.
            out.println("\nNow, please enter the quantity of each item.");
            out.print("How many " +itemOne+ "? ");
            int amountOne = keyboard.nextInt();
            keyboard.skip("\n");
            out.print("\nHow many " +itemTwo+ "? ");
            int amountTwo = keyboard.nextInt();
            keyboard.skip("\n");
            out.print("\nHow many " +itemThree+ "? ");
            int amountThree = keyboard.nextInt();
            keyboard.skip("\n");

            //Ask for price of each item from user.
            out.println("\nNow, please enter the price of each item.");
            out.print("How much does one " +itemOne+ " cost? ");
            float costOne = keyboard.nextFloat();
            out.print("\nHow much does one " +itemTwo+ " cost? ");
            float costTwo = keyboard.nextFloat();
            out.print("\nHow much does one " +itemThree+ " cost? ");
            float costThree = keyboard.nextFloat();

            //Calculate and print total cost of grocery bill.
            float totalCostOne = (float)(amountOne * costOne);
            float totalCostTwo = (float) (amountTwo * costTwo);
            float totalCostThree = (float) (amountThree * costThree);
            float totalGroceryCost = (float) (totalCostOne + totalCostTwo + totalCostThree);
            out.println("\nCalculating your total grocery bill.");
            out.print("Your total cost is " +totalGroceryCost);
        }
}

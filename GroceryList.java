
import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
    {
        public static void main(String[] args)
        {
            Scanner keyboard = new Scanner(System.in);
            // Ask for three items on grocery list from user.
            out.println("Please list three items on your grocery shopping list.");
            String itemOne;
            out.print("Item 1? ");
            itemOne = keyboard.nextLine();
            String itemTwo;
            out.print("\nItem 2? ");
            itemTwo = keyboard.nextLine();
            String itemThree;
            out.print("\nItem 3? ");
            itemThree = keyboard.nextLine();

            //Ask for quantity of the each item from user.
            out.println("\nNow, please enter the quantity of each item.");
            int amountOne;
            out.print("How many " +itemOne+ "? ");
            amountOne = keyboard.nextInt();
            keyboard.skip("\n");
            int amountTwo;
            out.print("\nHow many " +itemTwo+ "? ");
            amountTwo = keyboard.nextInt();
            keyboard.skip("\n");
            int amountThree;
            out.print("\nHow many " +itemThree+ "? ");
            amountThree = keyboard.nextInt();
            keyboard.skip("\n");

            //Ask for price of each item from user.
            out.println("\nNow, please enter the price of each item.");
            float costOne;
            out.print("How much does one " +itemOne+ " cost? ");
            costOne = keyboard.nextFloat();
            float costTwo;
            out.print("\nHow much does one " +itemTwo+ " cost? ");
            costTwo = keyboard.nextFloat();
            float costThree;
            out.print("\nHow much does one " +itemThree+ " cost? ");
            costThree = keyboard.nextFloat();

            //Calculate and print total cost of grocery bill.
            float totalCostOne;
            totalCostOne = (float)(amountOne * costOne);
            float totalCostTwo;
            totalCostTwo = (float) (amountTwo * costTwo);
            float totalCostThree;
            totalCostThree = (float) (amountThree * costThree);
            float totalGroceryCost;
            totalGroceryCost = (float) (totalCostOne + totalCostTwo + totalCostThree);
            out.println("\nCalculating your total grocery bill.");
            out.print("Your total cost is " +totalGroceryCost);
        }
}

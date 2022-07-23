import java.util.Scanner; //for normal input
import javax.swing.JOptionPane; //for input using the dialogt box

public class PriceCalculator {
    public static void main(String[] args) {
        // declare variables
        String itemName;
        double poundPrice;
        double poundsWeight;
        double ouncesWeight;
        double unitPrice;
        double totalPrice;
        final int currencyUnit = 16;

        // Prompt for input using JOptionPane
        String input;
        itemName = JOptionPane.showInputDialog("Enter the name of the item ");
        input = JOptionPane.showInputDialog("Enter the price of the item in pounds ");
        poundPrice = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter the weight of the item in pounds ");
        poundsWeight = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter the weight of the item in Ounces ");
        ouncesWeight = Double.parseDouble(input);

        // calculating the unit price and the total price
        unitPrice = poundPrice / currencyUnit;
        totalPrice = poundPrice * (poundsWeight + ouncesWeight / currencyUnit);

        // Displaying the result

        JOptionPane.showMessageDialog(null, "The unit price of the item is $" + unitPrice);

        JOptionPane.showMessageDialog(null, "The total price of the item is $" + totalPrice);

        // prompt for user input Using Util.Scanner
        /*
         * Scanner input = new Scanner(System.in);
         * System.out.print("Enter the name of the item ");
         * itemName = input.nextLine();
         * System.out.print("Enter the price of the item in pounds ");
         * poundPrice = input.nextDouble();
         * System.out.print("Enter the weight of the item in pounds ");
         * poundsWeight = input.nextDouble();
         * System.out.print("Enter the weight of the item in ounces ");
         * ouncesWeight = input.nextDouble();
         */
        // performing necessary calculations
        /*
         * /
         * unitPrice = poundPrice / currencyUnit;
         * totalPrice = poundPrice * (poundsWeight + ouncesWeight / currencyUnit);
         * 
         * // displaying results using echo programming style
         * System.out.println("Name of item " + itemName);
         * System.out.printf("the weight in pounds is %.1f \n", poundsWeight);
         * System.out.printf("the weight in ounces is %.1f \n", ouncesWeight);
         * System.out.printf("The unit price is $%,.2f \n", unitPrice);
         * System.out.printf("The total price is $%,.2f \n", totalPrice);
         */
    }
}
// This is to use JOptionPane for dialog boxes
import javax.swing.JOptionPane;

// This program will compute the tax and tip on a restaurant bill
public class RestaurantBillCalculator {
    public static void main(String[] args) {

        //Constants
        final double TAX_RATE = 7.5; // Tax rate in percent
        final double TIP_RATE = 18.0; // Tip rate in percent;

        // Variables
        double mealCharge, billTotal; // Amount of the meal
        String inputString; // To hold user input

        // Get the meal charge from the user
        inputString = JOptionPane.showInputDialog("Enter the charge for the meal:");
        mealCharge = Double.parseDouble(inputString);

        // Calculate the meal charge, tax, tip, and total bill
        billTotal = mealCharge + (mealCharge * TAX_RATE / 100) + (mealCharge * TIP_RATE / 100);

        // Display the meal charge, tax, tip, and total bill
        JOptionPane.showMessageDialog(null, String.format(
                                        "Your Final Bill:\n" +
                                        "Meal Charge: $%.2f\n" +
                                        "Tax: $%.2f\n" +
                                        "Tip: $%.2f\n" +
                                        "Total Bill: $%.2f",
                                        mealCharge, // Meal charge
                                        (mealCharge * TAX_RATE / 100), // Calculate tax
                                        (mealCharge * TIP_RATE / 100), // Calculate tip
                                        billTotal
                                    ));
        System.exit(0); // Exit the program
    }
}

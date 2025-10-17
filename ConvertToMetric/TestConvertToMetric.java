import java.util.Scanner; //for the scanner class

/* 
*This program is a test of the ConvertToMetric class 
*/

public class TestConvertToMetric
{
    public static void main(String[] args)
    {
        ConvertToMetric convert;  //declares a ConvertToMetric object
        double standardLength; //declares a double variable for length
        Scanner Keyboard = new Scanner(System.in); //creates a keyboard ~ scanner object and declares it

        System.out.print("Enter a Length in feet: "); //prompt for user input
        standardLength = Keyboard.nextDouble(); //reads in the length

        convert = new ConvertToMetric(standardLength); //creates the ConvertToMetric object
        
        System.out.print("You entered " + convert.getStandard() + " feet. \n"); //displays the length entered
        System.out.printf("%.2f feet in meters is %.2f \n", convert.getStandard(), convert.getMeters()); //displays the length in meters
        System.out.printf("%.2f feet in centimeters is %.2f \n", convert.getStandard(), convert.getCentimeters()); //displays the length in centimeters

        System.out.print("Let's try another number. Enter a new length: "); //prompt for user input
        standardLength = Keyboard.nextDouble(); //reads in the length
        convert.setStandard(standardLength); //sets the new length in the object

        System.out.print("You entered " + standardLength + " feet. \n"); //displays the length entered
        System.out.printf("%.2f feet in meters is %.2f \n", convert.getStandard(), convert.getMeters()); //display the new length in meters
        System.out.printf("%.2f feet in centimeters is %.2f \n", convert.getStandard(), convert.getCentimeters()); //display the new length in centimeters

    }
}


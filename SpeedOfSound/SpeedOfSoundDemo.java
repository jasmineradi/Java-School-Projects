import java.util.Scanner;

/** 
 * This program will display a menu allowing the user to select air, water, or steel 
 * and then they will be asked to enter the distance a sound wave will travel through the selected medium.
 */

public class SpeedOfSoundDemo{

    public static void main(String[] args) {

        double input;
        double distance;
        String medium;
        Scanner keyboard = new Scanner(System.in);
        SpeedOfSound Speed = new SpeedOfSound();
        System.out.println("Please select \n 1. air \n 2. water \n 3. steel. \n");
        int choice = keyboard.nextInt();

        switch (choice) {
            case 1:
                medium = "air";
                System.out.println("Enter the distance (in feet) that the sound will travel through "  + medium);
                input = keyboard.nextDouble();
                distance = Speed.getSpeedInAir(input);
                System.out.println("It will take " + distance + " seconds for sound to travel that far through the " + medium);
                break;
            case 2:
                medium = "water";
                System.out.println("Enter the distance (in feet) that the sound will travel through "  + medium);
                input = keyboard.nextDouble();
                distance = Speed.getSpeedInWater(input);
                System.out.println("It will take " + distance + " seconds for sound to travel that far through the " + medium);
                break;
            case 3:
                medium = "steel";
                System.out.println("Enter the distance (in feet) that the sound will travel through "  + medium);
                input = keyboard.nextDouble();
                distance = Speed.getSpeedInSteel(input);
                System.out.println("It will take " + distance + " seconds for sound to travel that far through the " + medium);
                break;
            default:
                medium = "";
                System.out.println("Please only select 1, 2, or 3.");
                break;
        }

        keyboard.close();
        
    }
}
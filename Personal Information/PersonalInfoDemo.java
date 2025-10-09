/* This program demonstrates the PersonalInfo class */

public class PersonalInfoDemo 
{
    public static void main(String[] args)
    {
        PersonalInfo me; //to reference a PersonalInfo object for my info
        PersonalInfo friend; //to reference a PersonalInfo object for friend info
        PersonalInfo family; //to reference a PersonalInfo object for family info

        me = new PersonalInfo("Jasmine", "1542 9th Avenue South, Fargo, ND 58103", 33, "701-715-5453");
        friend = new PersonalInfo("Alexis Anderson", "789 Oak Avenue, Fargo, ND 58103", 36, "701-786-5352");
        family = new PersonalInfo("Tracy Jirout", "545 4th Street South Mayville, ND 58257", 55, "701-388-0675");
    
        //This is info about me
        System.out.println("My first name is " + me.getName() + "." +
        "\nI am " + me.getAge() + " years old." +
        "\nI live at " + me.getAddress() + "." +
        "\nMy phone number is " + me.getPhoneNumber()+ "."
        );

        //This is info about a friend
        System.out.println("\nMy first name is " + friend.getName() + "." +
        "\nI am " + friend.getAge() + " years old." +
        "\nI live at " + friend.getAddress() + "." +
        "\nMy phone number is " + friend.getPhoneNumber()+ "."
        );

        //This is info about family
        System.out.println("\nMy first name is " + family.getName() + "." +
        "\nI am " + family.getAge() + " years old." +
        "\nI live at " + family.getAddress() + "." +
        "\nMy phone number is " + family.getPhoneNumber()+ "."
        );

    }
}


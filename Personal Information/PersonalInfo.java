/*This is the PersonalInfo class, 
* This class will help simulate a contact list in the PersonalInformation.java program
*/

public class PersonalInfo
{
    private String name; //to store name
    private String address; //to store address
    private int age; //to store age
    private String phoneNumber; //to store phone number


public PersonalInfo(String n, String ad, int ag, String ph)
{
    name = n;
    address = ad;
    age = ag;
    phoneNumber = ph;
}

/* *************************************************************** */
/* The setters/mutators */
/* *************************************************************** */

/* The setName method will set the name*/
public void setName(String n) {
    name = n;
}

/* The setAddress method will set the address*/
public void setAddress(String ad) {
    address = ad;
}

/* The setAge method will set the age*/
public void setAge(int ag){
    age = ag;
}

/* The setPhoneNumber method will set the phone number*/
public void setPhoneNumber(String ph){
    phoneNumber = ph;
}

/* *************************************************************** */
/* The getters/accessors */
/* *************************************************************** */

/* will return name */
public String getName() {
    return name;
}

/* will return address */
public String getAddress(){
    return address;
}

/* will return age */
public int getAge(){
    return age;
}

/* will return phone number */
public String getPhoneNumber(){
    return phoneNumber;
}
}

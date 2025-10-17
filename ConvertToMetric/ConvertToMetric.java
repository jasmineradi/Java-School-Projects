/* 
* Convert to Metric class
* This class converts standard measurements to metric measurements 
*/

public class ConvertToMetric {
    /*********************** 
     Variable Declarations 
     ***********************/

    private double standard;

    /**************************************************
    Constructor to initialize the standard measurement
    ***************************************************/
    
    public ConvertToMetric(double stdrd) { 
        standard = stdrd;
    }

    /*********
    Methods
    *********/

    /* This is the set standard method */
    public void setStandard(double stdrd) {
        standard = stdrd;
    }

    /* This is the get standard method */
    public double getStandard() {
        return standard;
    }

    /* This is the getMeters method */
    public double getMeters() {
        return standard * 0.3048;
    }

    /* This is the getCentimeters method */
    public double getCentimeters() {
        return standard * 30.48;
    }
}
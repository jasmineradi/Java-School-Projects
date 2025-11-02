/** This class will display the speed of sound in air, water, steel*/

public class SpeedOfSound {
    private int speedInAir;
    private int speedInWater;
    private int speedInSteel;
    private double distance;

    // Constructor
    public SpeedOfSound() {
        speedInAir = 1100;
        speedInWater = 4900;
        speedInSteel = 16400;
    }

    // Accessor for speed of sound in air
    public double getSpeedInAir(double dist) {
        distance = dist;
        return distance / speedInAir;
    }

    // Accessor for speed of sound in water
    public double getSpeedInWater(double dist){
        distance = dist;
        return distance / speedInWater;
    }

    // Accessor for speed of sound in steel
    public double getSpeedInSteel(double dist){
        distance = dist;
        return distance / speedInSteel;
    }

}
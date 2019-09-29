/**
 *
 * @author Jeremy Gonzales
 * @version March 31, 2019
 *
 * A class containing the necessary elements of a bay.
 */

public class Bays {

    private boolean available;
    public Car c;

    /**
     * Constructor
     * Initializes the bay availability.
     */
    public Bays() {
        available = true;
    }

    /**
     * Adds the car in the bay.
     * @param car the Car type.
     */
    public void addCar(Car car) {
        this.c = car;
        available = false;
    }

    /**
     * Removes the car in the bay.
     */
    public void removeCar() {
        c = null;
        available = true;
    }

    /**
     * Sets the availability of the bay.
     * @param available a boolean representing the availability of the bay.
     */
    public void setAvailability(boolean available) {
        this.available = available;
    }

    /**
     * Returns the availability of the bay.
     * @return the availability of the bay.
     */
    public boolean getAvailability() {
        return available;
    }

}

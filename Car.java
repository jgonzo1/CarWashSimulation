/**
 *
 * @author Jeremy Gonzales
 * @version March 31, 2019
 *
 * A class containing the properties of the car being washed.
 */
public class Car {

    private CarWashOption option;
    private int timeremain;
    private double price;

    /**
     * Constructor
     * Contains the time remaining and price for the wash.
     * @param option a specific car wash option.
     */
    public Car(CarWashOption option) {
        this.option = option;
        timeremain = option.getTime();
        price = option.getPrice();
    }

    /**
     * Returns the time remaining for the wash to be completed.
     * @return the time remaining for the wash to be completed.
     */
    public int getTimeremain() {
        return timeremain;
    }

    /**
     * Returns the price of the wash.
     * @return the price of the wash.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns the current car wash option.
     * @return the current car wash option.
     */
    public CarWashOption getCarWashOption() {
        return option;
    }

    /**
     * Decrements the time with the provided time steps.
     * @param timesteps an integer specifying the time step.
     */
    public void decrementTime(int timesteps) {
        timeremain = timeremain - timesteps;
    }

}

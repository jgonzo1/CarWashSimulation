import java.util.Random;

/**
 *
 * @author Jeremy Gonzales
 * @version March 31, 2019
 *
 * An enum class specifying the different types of car wash options.
 */

public enum CarWashOption {

    BASIC(10, 15),
    STANDARD(20, 20),
    HEAVY(30, 35 ),
    ULTRA(45, 50),
    SUPERSQUEEK(60, 100);

    private static CarWashOption[] vals = values();
    private static Random gen = new Random();

    private int time;
    private double price;

    /**
     * Constructor
     * @param time an integer representing the time to wash the car.
     * @param price a double representing the price of the wash.
     */
    CarWashOption(int time, double price) {
        this.time = time;
        this.price = price;
    }

    /**
     * Returns the time of the wash option.
     * @return the time of the wash option.
     */
    public int getTime() {
        return time;
    }

    /**
     * Returns the price of the wash option.
     * @return the price of the wash option.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns a random car wash option.
     * @return a random car wash option.
     */
    public static CarWashOption getRandomOption() {
        return vals[(gen.nextInt(vals.length))];
    }

}

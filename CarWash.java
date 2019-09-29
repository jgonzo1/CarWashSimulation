import java.util.*;
/**
 *
 * @author Jeremy Gonzales
 * @version March 31, 2019
 *
 * A class containing the necessary elements to run the car wash.
 */

public class CarWash {

    private Queue<Car> queue = new ArrayDeque<>();
    private List<Bays> bays = new ArrayList<>();

    private static Random gen = new Random();
    private int timecount = 0;
    private int carcount = 0;
    private int carcleared = 0;
    private int maxsize;
    private int carleft;
    private double revenue;
    private double chance;
    private static final int DEFAULTSIMDURATION = 480;

    /**
     * Constructor
     * Initializes the amount of bays.
     * @param bays an integer argument specifies the amount of bays.
     */
    public CarWash(int bays) {
        for (int i = 0; i < bays; i ++) {
            this.bays.add(new Bays());
        }
    }

    /**
     * Runs and simulates the car wash system.
     * @param timesteps an integer specifying the time step.
     * @param chance a double variable specifying the probability of a car appearing.
     */
    public void run(int timesteps, double chance) {

        this.chance = chance;
        maxsize = queue.size();

        for(int i = 0; i < DEFAULTSIMDURATION; i = i + timesteps) {

            //add cars to queue
            if (gen.nextDouble() <= chance) {
                queue.add(new Car(CarWashOption.getRandomOption()));
                carcount++;
            }

            if(maxsize < queue.size())
                maxsize = queue.size();


            //add cars into bays
            if (!queue.isEmpty()) {
                for(Bays a : bays) {
                    if (a.getAvailability() && !queue.isEmpty()) {
                        a.addCar(queue.remove());
                    }
                }
            }

            //decrement time and remove cars
            for(Bays a : bays) {
                if(!a.getAvailability()) {
                    a.c.decrementTime(timesteps);
                    if(a.c.getTimeremain() <= 0) {
                        revenue = revenue + a.c.getPrice();
                        a.removeCar();
                        carcleared++;
                    }
                }
            }
            timecount++;
        }

        carleft = queue.size();

    }
    /**
     * Prints the final data of the simulation.
     */
    public void printData() {
        System.out.println("Number of time steps ran: " + timecount);
        System.out.println("Number of Bays: " + bays.size());
        System.out.println("Car arrival probability: " + chance);
        System.out.println("Maximum car wash queue: " + maxsize);
        System.out.println("Cars left in queue: " + carleft);
        System.out.println("Total number of cars washed: " + carcleared);
        System.out.println("Total revenue of cars washed: " + revenue + "\n");
    }
}


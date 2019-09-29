/**
 *
 * @author Jeremy Gonzales
 * @version March 31, 2019
 *
 * A class managing the simulations.
 */
public class CarWashManager {

    public static void main(String [] args) {
        CarWash c1 = new CarWash(6);
        CarWash c2 = new CarWash(10);
        CarWash c3 = new CarWash(20);

        c1.run(5, .5);
        c2.run(2, .7);
        c3.run(1, .7);

        c1.printData();
        c2.printData();
        c3.printData();
    }

}

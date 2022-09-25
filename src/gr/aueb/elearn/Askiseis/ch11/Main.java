package gr.aueb.elearn.Askiseis.ch11;
import  gr.aueb.elearn.Askiseis.ch11.Vehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();

        v1.setType("car");
        v1.setCubicCapacity(1000);
        v1.setReleaseYear(2001);
        v1.setLongVehicle(false);


        System.out.println("v1: " + v1.toString());

        Vehicle.getCounter();


        Vehicle v2 = new Vehicle();

        System.out.println("v2: " + v2.toString());

        Vehicle.getCounter();

    }
}

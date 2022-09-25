package gr.aueb.elearn.Askiseis.ch11;

public class Vehicle {
    private String type;
    private int releaseYear;
    private int cubicCapacity;
    private boolean longVehicle;
    private  static int counter;

    public Vehicle(){
        counter++;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public boolean isLongVehicle() {
        return longVehicle;
    }

    public void setLongVehicle(boolean longVehicle) {
        this.longVehicle = longVehicle;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", releaseYear=" + releaseYear +
                ", cubicCapacity=" + cubicCapacity +
                ", longVehicle=" + longVehicle +
                '}';
    }

    public static void getCounter(){
        System.out.println("Counter is : " + counter);
    }

}

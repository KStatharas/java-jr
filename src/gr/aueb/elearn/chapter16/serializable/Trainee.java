package gr.aueb.elearn.chapter16.serializable;


import java.io.Serializable;

public class Trainee implements Cloneable, Serializable {
    private String name;
    private City city;

    public Trainee() {
    }

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public Trainee(Trainee trainee) {
        this.name = trainee.getName();
        this.city = new City(city.getDescription());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    protected Trainee clone() throws CloneNotSupportedException {
        Trainee trainee = (Trainee) super.clone();
        City city = new City(this.getCity().getDescription());
        trainee.setCity(city);
        return trainee;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainee trainee = (Trainee) o;
        return getName().equals(trainee.getName()) && getCity().equals(trainee.getCity());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = result * prime + (((city == null))?0 : city.hashCode());
        result = result * prime + (((name == null))?0 : name.hashCode());

        return result;
    }
}

package gr.aueb.elearn.chapter16.clonable;

public class City implements Cloneable{
    private String description;

    public City(){}

    public City(String description) {
        this.description = description;
    }

    public City(City city){
        this.description = city.getDescription();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    protected City clone() throws CloneNotSupportedException {
        return (City)(super.clone());
    }

    @Override
    public String toString() {
        return "City{" +
                "description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainee trainee = (Trainee) o;
        return getDescription().equals(trainee.getName()) && getDescription().equals(trainee.getCity());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = result * prime + (((description == null))?0 : description.hashCode());
        return result;
    }
}

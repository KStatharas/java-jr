package gr.aueb.elearn.chapter16.clonable;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        City athens = new City("Athens");
        City clonedAthens = athens.clone();

        Trainee alice = new Trainee("Alice",athens);
        Trainee clonedAlice = alice.clone();
        clonedAlice.setCity(new City("Volos"));

        clonedAthens.setDescription("Athens 2");

        System.out.println(athens);
        System.out.println(clonedAthens);
    }
}

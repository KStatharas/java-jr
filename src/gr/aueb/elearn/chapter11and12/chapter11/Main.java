package gr.aueb.elearn.chapter11and12.chapter11;

import gr.aueb.elearn.chapter11and12.Student;

public class Main {

    public static void main(String[] args) {
        Student alice = new Student();
        Student bob = new Student(2,"Bob","Dylan");
        bob.setId(5);

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        System.out.println("Alice id:" + alice.getId());
        System.out.println("Alice firstname:" + alice.getFirstname());
        System.out.println("Alice lastname:" + alice.getLastname());

        System.out.println("Number of student instances: " + Student.getStudentsCount());
    }
}

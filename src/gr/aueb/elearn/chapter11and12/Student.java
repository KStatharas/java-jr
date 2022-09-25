package gr.aueb.elearn.chapter11and12;

public class Student {


    private static int studentsCount;
    private int id;
    private String firstname;
    private String lastname;

    public Student() {
        studentsCount++;
    }

    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount++;
    }


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public static int getStudentsCount() {
        return studentsCount;
    }

    public static void setStudentsCount(int studentsCount) {
        Student.studentsCount = studentsCount;
    }


}

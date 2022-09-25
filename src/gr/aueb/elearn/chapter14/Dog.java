package gr.aueb.elearn.chapter14;

public class Dog implements ISpeakable {
    private String nickname;
    private double age;

    public Dog(){};

    public Dog(String nickname, double age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public void  speak(){
        System.out.printf("%s dog says hello",nickname);
    }
}

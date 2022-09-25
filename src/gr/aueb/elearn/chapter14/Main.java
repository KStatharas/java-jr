package gr.aueb.elearn.chapter14;

public class Main {

    public static void main(String[] args) {
        ISpeakable chloeCat = new Cat("Chloe",1);
        ISpeakable blackDog = new Dog("Black",2);

        sayHello(chloeCat);
        sayHello(blackDog);
    }

    public static void  sayHello(ISpeakable iSpeakable){
        iSpeakable.speak();
    }
}

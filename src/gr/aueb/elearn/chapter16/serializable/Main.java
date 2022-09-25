package gr.aueb.elearn.chapter16.serializable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Users/Mutantin/IdeaProjects/java-jr/src/gr/aueb/elearn/chapter16/serial.ser"))){
            Trainee alice = new Trainee("Alice",new City("Athens"));
            oos.writeObject(alice);

        }catch (FileNotFoundException | NotSerializableException e1){
            e1.printStackTrace();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Mutantin\\IdeaProjects\\java-jr\\src\\gr\\aueb\\elearn\\chapter16\\sr.ser"))) {
            Trainee  alice;
            alice = (Trainee)(ois.readObject());
            System.out.println(alice.getName() + "get back");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException | NotSerializableException e1){
            System.out.println("Not serializable");
        }catch (IOException e2) {
            System.out.println(e2.getMessage());
        }
    }
}

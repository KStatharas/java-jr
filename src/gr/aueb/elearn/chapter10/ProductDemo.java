package gr.aueb.elearn.chapter10;

import gr.aueb.elearn.chapter7.StringCreateAndTraverse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductDemo {
    static String[] products = new String[100];
    static int top = -1;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = 0;
        String inputName = "";
        String inputNewName = "";

        do{
            printMenu();
            choice = getChoice();

            switch (choice){
                case 1:
                    inputName = getName();
                    insert(products,inputName);
                    break;
                case 2:
                    inputName = getName();
                    System.out.printf("Iteme&sxists" ,((itemExists(products,inputName)) ? " " : " not "));
                    break;
                case 3:
                    inputName = getName();
                    inputName = getName().trim();
                    replace(products,inputName, inputNewName);
                    break;
                case 4:
                    inputName = getName();
                    delete(products,inputName);
                    break;
                case 5:
                    break;
                case 6:
                    printItems(products);
                    break;
                case 7:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Eplekste 1-7");
                    break;
            }
        }while ( choice!=7);

    }

    public static void insert(String[] arr, String name){
        if (arr == null || name == null) return;
        if (name.equals("")) return;

        if (getPosition(arr,name) == -1){
            top++;
            arr[top] = name;

        }
        else{
            System.out.println("item already exists");
        }
    }

    public static int getPosition (String[] arr, String name){
        if (arr == null || name == null) return -1;
        if (name.equals("")) return -1;

        for (int i = 0; i < top; i++) {
            if (arr[i].equals(name)) return i;
        }
        return -1;
    }

    public static void replace(String[] arr, String oldName, String newName){
        if (arr == null || newName == null) return;
        if (newName.equals("")) return;

        int positionToUpdate = getPosition(arr,oldName);
        if(positionToUpdate == -1){
            System.out.println("Item not found");
        }
        else {
            arr[positionToUpdate] = newName;
        }
    }

    public static String delete (String[] arr, String name){
        if (arr == null || name == null) return "";
        if (name.equals("")) return "";

        int positonToDelete = getPosition(arr, name);
        String toBeReturned = "";

        if (positonToDelete == -1){

        }
        else {
            toBeReturned = arr[positonToDelete];
            System.arraycopy(arr,positonToDelete + 1, arr, positonToDelete, (top - positonToDelete));
            top --;
        }
        return toBeReturned;
    }

    public static boolean itemExists(String[] arr, String name){
        return (getPosition(arr,name) != -1);
    }

    public static  void  printMenu(){
        System.out.println("Eπιλέξτε ένα απο τα παρακάτω: ");
        System.out.println("1. Εισαγωγή Προιόντος");
        System.out.println("2. Αναζήτηση Προιόντος");
        System.out.println("3.Ενημέρωση Προιόντος");
        System.out.println("4.Διαγραφή Προιόντος");
        System.out.println("5.Αντιγραφή Προιόντος");
        System.out.println("6.Εμφάνιση Προιόντος");
        System.out.println("7.Eksodos");
    }

    public static int getChoice(){
        try {
            return in.nextInt();
        } catch (InputMismatchException e) {
            in.nextLine();
            System.out.println("Doste egkyri tim");
            return -1;
        }
    }

    public static String getName(){
        System.out.println("Doste onoma");
        return in.next();
    }

    public static void printItems(String[] arr){
        for (int i = 0; i <= top ; i++) {
            System.out.println(arr[i]);
        }
    }

}

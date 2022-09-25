package gr.aueb.elearn.chapter16.lambdasAndRunnable;

public class PlayTheGame {
    public static void main(String[] args) {
        Runnable joa = new Knight("JOA");
        Runnable saintGeorge = new Knight("SAINT GEORGE");
        Runnable arthur = new Knight("ARTHUR");

        (new Thread(joa)).start();
        (new Thread(saintGeorge)).start();
        (new Thread(arthur)).start();

//        joa.embarkOfMission(new IMission() {
//            @Override
//            public void embark() {
//                System.out.println("Save the Princess");
//            }
//        });
//
//        saintGeorge.embarkOfMission(new IMission() {
//            @Override
//            public void embark() {
//                System.out.println("Kill the Dragon");
//            }
//        });
//
//        joa.embarkOfMission(()-> System.out.println("Save the Princess"));
//        saintGeorge.embarkOfMission(()-> System.out.println("Kill the Dragon"));
//
//        joa.embarkOfMission(()->saveThePrincess());
//        joa.embarkOfMission(PlayTheGame::saveThePrincess);
//
//        saintGeorge.embarkOfMission(PlayTheGame::killTheDraon);
    }

    public static void saveThePrincess(){
        System.out.println("Save the Princess");
    }

    public static void killTheDraon(){
        System.out.println("Kill the Dragon");
    }
//}

}
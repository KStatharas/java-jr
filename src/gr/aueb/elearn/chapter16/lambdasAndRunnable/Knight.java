package gr.aueb.elearn.chapter16.lambdasAndRunnable;

//POJO class with only 1 method

public class Knight  implements IKnight,Runnable{
    private final String name;

    public Knight (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void embarkOfMission(IMission iMission) {
        System.out.println("Knight name: " + getName());
        iMission.embark();
        iMission.setStatus(MissionStatus.STARTED);
    }

    @Override
    public void run(){
        synchronized (IKnight.missions){
            for (IMission mission : IKnight.missions){
                if (mission.getStatus() == MissionStatus.NOT_STARTED){
                    this.embarkOfMission(mission);
                }
            }
        }

    }
}

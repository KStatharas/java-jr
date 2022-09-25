package gr.aueb.elearn.chapter16.lambdasAndRunnable;

public class SaveThePrincess implements IMission{

    private MissionStatus missionStatus = MissionStatus.NOT_STARTED;

    @Override
    public void embark() {
        System.out.println("Save The Princess");
    }

    @Override
    public MissionStatus getStatus() {
        return missionStatus;
    }

    @Override
    public void setStatus(MissionStatus missionStatus) {
        this.missionStatus = missionStatus;
    }
}

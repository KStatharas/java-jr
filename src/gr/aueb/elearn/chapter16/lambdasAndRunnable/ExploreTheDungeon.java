package gr.aueb.elearn.chapter16.lambdasAndRunnable;

public class ExploreTheDungeon implements IMission{
    private MissionStatus missionStatus = MissionStatus.NOT_STARTED;
    @Override
    public void embark() {
        System.out.println("Explore the Dungeon");
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

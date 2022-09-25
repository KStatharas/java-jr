package gr.aueb.elearn.chapter16.lambdasAndRunnable;

public interface IMission {
    MissionStatus getStatus();
    void setStatus(MissionStatus missionStatus);
    void embark();
}

package gr.aueb.elearn.chapter16.lambdasAndRunnable;

public interface IKnight {
    void embarkOfMission(IMission iMission);

        IMission[] missions = {
                new SaveThePrincess(),
                new KillTheDragon(),
                new ExploreTheDungeon()
        };

}

package gr.aueb.elearn.chapter14;

public class SpeakingSchool {
    private ISpeakable iSpeakable;

    public SpeakingSchool(ISpeakable iSpeakable){
        this.iSpeakable = iSpeakable;
    }

    public  void  learnToSpeak(){
        iSpeakable.speak();
    }
}

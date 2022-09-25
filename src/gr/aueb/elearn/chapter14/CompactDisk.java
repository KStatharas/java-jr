package gr.aueb.elearn.chapter14;

public class CompactDisk implements Item{
    private long id;
    private String title;

    CompactDisk(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

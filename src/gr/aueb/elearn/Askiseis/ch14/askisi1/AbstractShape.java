package gr.aueb.elearn.Askiseis.ch14.askisi1;

public class AbstractShape implements IShape{
    private long id;

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }

}

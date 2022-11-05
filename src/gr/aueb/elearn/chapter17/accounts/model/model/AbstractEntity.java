package gr.aueb.elearn.chapter17.accounts.model.model;

public class AbstractEntity implements IdentifiableEntity {
    private long id;

    @Override
    public long getId() {
        return 0;
    }

    public void setId(long id) {
        this.id = id;
    }
}

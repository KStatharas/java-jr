package gr.aueb.elearn.chapter14.IdentifiableEntity;

/**
 * Skeletal Implementation
 * **/

public abstract class AbstractEntity implements IdentifiableEntity {
    private long id;

    @Override
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }
}

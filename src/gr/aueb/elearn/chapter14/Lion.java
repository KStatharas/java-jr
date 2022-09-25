package gr.aueb.elearn.chapter14;

public class Lion extends AbstractAnimal {

    public Lion(){
        setId(1);
        setName("Yellow-Lion");
        setAge(100);
    }

    @Override
    public void speak(){
        System.out.println("Lon says hello");

    }

    @Override
    public String toString(){
        return "(" + getId() + "," + getName() + "," + getAge() + ")";
    }
}

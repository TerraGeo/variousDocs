package demo2;

/**
 * Created by Serhii_Ivanov on 5/10/2017.
 */
public class Originator {
    private String state;

    public Memento save(){
        System.out.println("Saving to Memento from Originator");
        return new Memento(state);
    }

    public void restore(Memento memento){
        state = memento.getState();
        System.out.println("After restoring Memento " + state);
    }

    public void setState(String state) {
        System.out.println("Setting state to " + state);
        this.state = state;
    }
}

package demo2;

import java.util.ArrayList;

/**
 * Created by Serhii_Ivanov on 5/10/2017.
 */
public class Caretaker {
    private ArrayList<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento memento){
        mementos.add(memento);
    }

    public Memento getMemento(int indexOfTheState) {
        return mementos.get(indexOfTheState);
    }
}

package org.example.seminar5.hw.service;

import org.example.seminar5.hw.model.Dog;

import java.util.Iterator;
import java.util.List;

public class DogsServiceListIterator implements Iterator<Dog> {
    private List<Dog>  listOfDogIterable;
    public static int count;
    public DogsServiceListIterator(List<Dog> listOfDogIterable) {
        this.listOfDogIterable = listOfDogIterable;
    }

    @Override
    public boolean hasNext() {
        return count<listOfDogIterable.size();
    }

    @Override
    public Dog next() {
        if (!hasNext()) return null;
        return listOfDogIterable.get(count);
    }
}

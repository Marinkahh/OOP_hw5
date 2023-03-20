package org.example.seminar5.hw.service;


import org.example.seminar5.hw.model.Dog;

import java.util.Iterator;
import java.util.List;

public class ServiceListOfDogs implements Iterable<Dog> {
    private List<Dog> listDogs;

    public List<Dog> getListDogs() {
        return listDogs;
    }

    public void setListDogs(List<Dog> listDogs) {
        this.listDogs = listDogs;
    }

    @Override
    public Iterator<Dog> iterator() {
        return new ServiceListOfDogsIterator(listDogs);
    }
}

package org.example.seminar5.hw;


import org.example.seminar5.hw.model.Dog;
import org.example.seminar5.hw.service.ServiceListOfDogs;
import org.example.seminar5.hw.service.ServiceListOfDogsIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServiceListOfDogs listDogs = new ServiceListOfDogs();
        List<Dog> ArrayList = new ArrayList<>();
        listDogs.setListDogs(ArrayList);
        ArrayList.add( new Dog("Бобик", 6));
        ArrayList.add (new Dog("Шарик", 5));
        ArrayList.add (new Dog("полкан", 7));
        Collections.sort(ArrayList);
        while (listDogs.iterator().hasNext() ){
            System.out.println(listDogs.iterator().next());
            ServiceListOfDogsIterator.count++;
        }
    }
}

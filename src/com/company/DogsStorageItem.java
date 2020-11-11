package com.company;

import java.util.ArrayList;
import java.util.List;

public class DogsStorageItem {
    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }

    List<Dog> dogs = new ArrayList<>();
}

package com.company;

import java.util.List;

public interface DataStorageRepository {
    List<Dog> load();
    void save(List<Dog> dogs);
}

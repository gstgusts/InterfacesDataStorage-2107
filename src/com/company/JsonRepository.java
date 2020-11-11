package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonRepository extends FileDataRepository implements DataStorageRepository {

    private ObjectMapper mapper = new ObjectMapper();

    public JsonRepository() {
        fileName = "dogs.json";
    }

    @Override
    public List<Dog> load() {
        File file = new File(getFilePath());
        try {
            var result = mapper.readValue(file, DogsStorageItem.class);
            return result.getDogs();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

    @Override
    public void save(List<Dog> dogs) {
        File file = new File(getFilePath());
        try {
            var storageItem = new DogsStorageItem();
            storageItem.setDogs(dogs);
            mapper.writeValue(file, storageItem);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

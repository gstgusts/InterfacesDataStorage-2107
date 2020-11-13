package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonRepository extends FileDataRepository {

    public JsonRepository() {
        fileName = "dogs.json";
        mapper = new ObjectMapper();
    }
}

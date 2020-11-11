package com.company;

public class FileDataRepository {
    private String BASE_PATH = "C:\\Temp\\";

    String fileName;

    String getFilePath() {
        return BASE_PATH + fileName;
    }
}

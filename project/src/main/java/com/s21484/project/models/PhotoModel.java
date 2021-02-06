package com.s21484.project.models;

public class PhotoModel {

    private final int id;
    private final String filename;

    public PhotoModel(int id, String filename) {
        this.id = id;
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public int getId() {
        return id;
    }

}

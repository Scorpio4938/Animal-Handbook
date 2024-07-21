package com.scorpio4938.animalhandbook.gui.screen.custom;

import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

public class AnimalHandbookContent {
    public static final List<String> Animal_HANDBOOK_CONTENTS = new ArrayList<>();
    private String type;
    private String object;
    private JsonObject content;
    private ArrayList<String> pages;

//    private final String DEFAULT_TEXT_PG_1 = "";
//
//    public void init() {
//        setContents();
//    }
//
//    public AnimalHandbookContent() {
//
//    }
//
//    private void setContents() {
//
//    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public JsonObject getContent() {
        return content;
    }

    public void setContent(JsonObject content) {
        this.content = content;
    }

    public ArrayList<String> getPages() {
        return pages;
    }

    public void setPages() {
//        this.pages = AnimalHandbookJsonReader.JsonArray.getArray();
    }


}

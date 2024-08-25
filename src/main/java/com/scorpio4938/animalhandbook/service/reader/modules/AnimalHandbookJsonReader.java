package com.scorpio4938.animalhandbook.service.reader.modules;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mojang.authlib.minecraft.client.ObjectMapper;
import com.scorpio4938.animalhandbook.service.reader.modules.custom.AnimalHandbookContent;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class AnimalHandbookJsonReader {
    private static String jsonPath = "./animal_handbook_content.json";

    public static AnimalHandbookContent getJson() {
        ObjectMapper objectMapper = new ObjectMapper(new Gson());

        try (FileReader reader = new FileReader(jsonPath)) {
            AnimalHandbookContent content = objectMapper.readValue(jsonPath, AnimalHandbookContent.class);
//            System.out.println(content.);
//            System.out.println(content.);
//            System.out.println(content.);
            return content;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<String> getPages() {
        AnimalHandbookContent content = getJson();
        if (content != null) {
            return content.getPages();
        }
        return null;
    }

    public static class JsonArray {
        public static List<String> getArray(String[] args) {
            String jsonArray = "[\"a\", \"b\", \"c\"]";

            Gson gson = new Gson();
            Type listType = new TypeToken<List<String>>() {
            }.getType();
            List<String> stringList = gson.fromJson(getJson().getPages().toString(), listType);

//            System.out.println(stringList);
            return stringList;
        }
    }
}

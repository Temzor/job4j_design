package ru.job4j.serialization.homework.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {
    public static void main(String[] args) {
        final Building building = new Building("Chicago", true, 73,
                new Street("Humboldt Park"), new int[] {1, 3, 8});

        final Gson gson = new GsonBuilder().create();
        System.out.println(gson.toJson(building));
        final String buildingJson =
                "{"
                        + "\"city\":\"Dresden\","
                        + "\"isCommerce\":false,"
                        + "\"countFloors\":60, "
                        + "\"street\":{\"nameStreet\":\"Steinstrase\"},"
                        + "\"buildDone\":[2,4,6]}";
        final Building buildingMod = gson.fromJson(buildingJson, Building.class);
        System.out.println(buildingMod);
    }
}

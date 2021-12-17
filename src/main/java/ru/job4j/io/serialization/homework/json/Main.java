package ru.job4j.io.serialization.homework.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        JSONObject jsonStreet = new JSONObject("{\"nameStreet\":\"Steinstrase\"}");

        /* JSONArray из ArrayList */
        List<String> list = new ArrayList<>();
        list.add("2");
        list.add("4");
        list.add("6");
        JSONArray jsonBuildDone = new JSONArray(list);

        /* JSONObject напрямую методом put */
        final Building building = new Building("Chicago", true, 73,
                new Street("Humboldt Park"), new int[] {1, 3, 8});
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("city", building.getCity());
        jsonObject.put("isCommerce", building.getIsCommerce());
        jsonObject.put("countFloors", building.getCountFloors());
        jsonObject.put("street", jsonStreet);
        jsonObject.put("buildDone", Collections.singleton(jsonBuildDone));

        /* Выведем результат в консоль */
        System.out.println(jsonObject);

        /* Преобразуем объект person в json-строку */
        System.out.println(new JSONObject(building));
    }
}


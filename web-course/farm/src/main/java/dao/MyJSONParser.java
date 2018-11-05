package dao;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyJSONParser {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        Object obj;
        try {
            obj = parser.parse(new FileReader("/home/ivko/IdeaProjects/JavaCourse/web-course/farm/src/main/resources/plants.json"));
            JSONObject jsonObject = (JSONObject) obj;

//            System.out.println(jsonObject.get("plant"));

            JSONArray plants = (JSONArray) jsonObject.get("plant");

            for (Object plant : plants) {
                plants.add(plant);
//                System.out.println(plant);
            }
            System.out.println(plants.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParseException | IOException pe) {
            System.out.println(pe.getMessage());
        }
    }
}
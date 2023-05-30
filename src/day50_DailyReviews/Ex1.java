package day50_DailyReviews;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {

    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Burak");
        map1.put(2, "Yunus");
        map1.put(3, "Burak");
        map1.put(4, "Çağlar");
        map1.put(5, "Ayşe");
        map1.put(6, "Tuğba");
        map1.put(7, "Nesrin");

        Map<Integer, Integer> result = new HashMap<>();

        for (Map.Entry<Integer, String> eachPair : map1.entrySet()) {
            result.put(eachPair.getKey(), eachPair.getValue().length());
        }

        //System.out.println(result);

        for (Map.Entry<Integer, Integer> eachPair : result.entrySet()) {
            if (eachPair.getValue() < 5) System.out.println(eachPair);
        }
    }

}

/*

Create a map which takes numbers as key and names as value
Add at least 6 names into map
Create a new map which takes numbers as key and the length of names of first map as value
Print the maps whose value's length is less than 5

 */
package main.mapone;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "candy");
        map.put("b", "dirt");
        map.put("c", "food");
        MapBully.mapBully(map);
        System.out.println(map);
    }
}

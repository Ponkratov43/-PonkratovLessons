package by.belhard.j20.ponkratov.lessons.lesson06.CollectionExample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, Value> map = new HashMap<>();

        map.put("value1", new Value("Value1"));
        map.put("value2", new Value("Value2"));
        map.put("value3", new Value("Value3"));
        map.put("value4", new Value("Value4"));

        System.out.println(map.toString());

        map.get("value1"); //return object


    }
}

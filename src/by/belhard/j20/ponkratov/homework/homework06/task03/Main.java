package by.belhard.j20.ponkratov.homework.homework06.task03;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String str = "saaaaaa123411111dgdshjhhhf";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int cnt = map.get(ch) != null ? map.get(ch) : 0;
            cnt++;
            map.put(ch, cnt);
        }

        for (Character key : map.keySet()) {
            System.out.println(key + "  =  " + map.get(key));
        }
    }
}

package dsa;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        String s = "anagram";
        String t = "nagaram";

        char key, key2;

        for(int i=0; i<s.length(); i++) {

            key = s.charAt(i);
            if(map.containsKey(key)) {
                int value = map.get(key);
                value++;
                map.put(key, value);
            }

            else {
                map.put(key, 1);
            }
        }

        for(int i=0; i<t.length(); i++) {

            key2 = t.charAt(i);
            if(map2.containsKey(key2)) {
                int value = map2.get(key2);
                value++;
                map2.put(key2, value);
            }

            else {
                map2.put(key2, 1);
            }
        }

        System.out.println(map);
        System.out.println(map2);

        System.out.println(map.equals(map2));
        /*map.put('a', 1);
        map.put('a', 2);
        map.put('n', 1);

        map.containsKey('a');
        map.get('a');

        System.out.println(map.containsKey('a'));
        System.out.println(map.get('a'));

        if(map.containsKey('a')) {
            count = map.get('a');
            count++;
            map.put('a', count);
        }
        else{
            map.put(ch, 1);
        }*/


    }
}

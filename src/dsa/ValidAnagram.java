package dsa;

import java.util.HashMap;

public class ValidAnagram {

    public static void main(String[] args) {
        boolean result = isAnagram("", "");
        System.out.println(result);
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(mapS.containsKey(ch)) {
                int value = mapS.get(ch);
                value++;
                mapS.put(ch, value);
            }
            else {
                mapS.put(ch, 1);
            }
        }

        for(int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);
             if(mapT.containsKey(ch)) {
                 int value = mapT.get(ch);
                 value++;
                 mapT.put(ch, value);
             }
             else {
                 mapT.put(ch, 1);
             }
        }

        return mapS.equals(mapT);
    }
}

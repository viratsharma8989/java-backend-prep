package dsa;

import java.util.HashSet;

public class ContainsDuplicate {

    static int[] arr = {1,3,2,4};


    public static void main(String[] args) {
        boolean result = containsDuplicate(arr);
        System.out.println(result);
    }

    public static boolean containsDuplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        int size = arr.length;

        for(int i=0; i<size; i++) {

        if(set.contains(arr[i])) {
            return true;
        }
        else {
            set.add(arr[i]);
        }
        }

        return false;
    }
}

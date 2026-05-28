package dsa;

// Initial accepted approach using midpoint condition

public class ReverseStringInitial {
    public void reverseString(char[] s) {

        int right =s.length-1, left =0;
        char temp;

        for(right = s.length-1 , left = 0 ; right >= (s.length)/2; right--, left++) {

            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }
}

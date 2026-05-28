package dsa;

// Optimized cleaner two-pointer approach

public class ReverseStringOptimized {
    public void reverseString(char[] s) {

        int right =s.length-1, left =0;
        char temp;

        while(right > left) {

            temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            right--;
            left++;
        }
    }
}

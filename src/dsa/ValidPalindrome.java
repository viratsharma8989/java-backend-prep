package dsa;


class ValidPalindrome {

    public static void main(String[] args) {
        String s = "8989";
        boolean result = isPalindrome(s);
        System.out.println(result);
    }
    public static boolean isPalindrome(String s) {

        s = s.toLowerCase();
        int length = s.length();
        StringBuilder str1 = new StringBuilder();
        boolean result = true;

        int left = 0;

        for(left = 0; left < length; left++) {

            char ch = s.charAt(left);
            if(((ch >= 'a') && (ch <= 'z')) || ((ch >= '0') && (ch <= '9'))) {
                str1.append(ch);
            }
        }
        System.out.println(str1);
        left = 0;
        int right = str1.length() -1;

        while(right > left) {
            if((str1.charAt(right)) == (str1.charAt(left))){
            }
            else {
                result = false;
                return result;
            }
            left++;
            right--;
        }

        return result;
    }
}
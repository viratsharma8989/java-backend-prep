package dsa;

public class IsSubsequence {

    public static void main(String[] args) {
       boolean result = isSubsequence("abc", "addcbsds");
        System.out.println(result);
    }

    public static boolean isSubsequence(String s, String t) {

        int i, j = 0;
        int slength = s.length();

        if(slength == 0){
            return true;
        }

        for(i = 0; i < t.length(); i++){
            if((t.charAt(i)) == s.charAt(j)) {

                j++;
                if(j == slength){
                    return true;
                }
            }
        }
        return false;
    }
}

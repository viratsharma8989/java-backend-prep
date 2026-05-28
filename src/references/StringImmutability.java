package references;

public class StringImmutability {

    public static void main(String[] args) {

        String s1 = "Java";
        System.out.println(System.identityHashCode(s1));

        String s2 = s1;
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        s1 = s1.concat(" Backend");

        System.out.println(System.identityHashCode(s1));
        System.out.println(s2);


        StringBuilder sb1 = new StringBuilder("Java");
        System.out.println(System.identityHashCode(sb1));

        StringBuilder sb2 = sb1;
        System.out.println(System.identityHashCode(sb1));
        System.out.println(System.identityHashCode(sb2));

        sb2.append(" Backend");
        System.out.println(System.identityHashCode(sb1));

        System.out.println(sb1);
    }
}

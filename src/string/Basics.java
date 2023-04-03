package string;

import java.util.Arrays;
import java.util.HashSet;

public class Basics {

    public static void sbf(){
        String str = "Geeks Gor Geeks";

        // Get the index
        int index = 6;

        // Get the character
        char ch = 'F';

        // Print the original string
        System.out.println("Original String = " + str);

        StringBuffer string = new StringBuffer(str);
        string.setCharAt(index, ch);
        string.setLength(0);
//        string.reverse()

        // Print the modified string
        System.out.println("Modified String = " + string);
        System.out.println("Original String = " + str);

        System.out.println(string.toString());
        System.out.println(string.append(" Geek"));
    }

    public static void splitSentence(){
        String str = "the sky  is    blue";
        String[] arr = str.split(" ");
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void strBufOperations(){
        String str = "aeiouAEIOU";
//        System.out.println(str.contains("u"));
        StringBuffer sbf = new StringBuffer(str);
        sbf.reverse();
        sbf.length();
//        System.out.println(sbf.reverse());

        for (int i = 0; i < sbf.length(); i++){
            if (sbf.charAt(i) == 'U')
                sbf.setCharAt(i, 'Z');
        }
        System.out.println("sbf = " + sbf);
    }

    public static void main(String[] args) {

        HashSet<Character> set = new HashSet<>();
        set.addAll(Arrays.asList('a', 'e', 'i', 'o', 'u'));
//        System.out.println("Contains = " + set.contains('e'));

        strBufOperations();
    }
}

package string;

import java.util.Arrays;

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

        // Print the modified string
        System.out.println("Modified String = " + string);
        System.out.println("Original String = " + str);

        System.out.println(string.toString());
    }

    public static void splitSentence(){
        String str = "the sky is blue";

    }

    public static void main(String[] args) {
        String str = "aeiouAEIOU";
        System.out.println(str.contains("u"));

        sbf();
    }
}

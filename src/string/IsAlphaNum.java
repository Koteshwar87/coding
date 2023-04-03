package string;

import java.util.ArrayList;
import java.util.Arrays;

public class IsAlphaNum {

    public static int solve(ArrayList<Character> A) {
        boolean isAlpha = true;
        int ch = 0;
        for(int i = 0; i < A.size() && isAlpha; i++){
            ch = A.get(i);
            System.out.println(ch);
            if(!( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') ))
                isAlpha = false;
        }
        System.out.println("isAlpha = " + isAlpha);
        if(isAlpha)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        solve(new ArrayList<>(Arrays.asList('3', '0', '2', '5')));
    }
}

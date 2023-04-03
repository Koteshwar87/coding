package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        st.push(6);

        System.out.println(st.peek());


    }
}

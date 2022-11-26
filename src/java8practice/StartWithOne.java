package java8practice;

import java.util.Arrays;
import java.util.List;

public class StartWithOne {
    public static void main(String[] args) {

        // Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,1,11,111,1111,11111,111111,11111111);

        myList.stream()
                .map(num -> num.toString())
                .filter(numStr -> numStr.startsWith("1"))
                .forEach(System.out::println);

    }
}

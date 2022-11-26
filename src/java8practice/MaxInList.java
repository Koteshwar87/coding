package java8practice;

import java.util.Arrays;
import java.util.List;

public class MaxInList {

    public static void main(String[] args) {

        //Given a list of integers, find the maximum value element present in it using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        myList.stream()
                .max(Integer::compare)
                .ifPresent(System.out::println);
    }
}

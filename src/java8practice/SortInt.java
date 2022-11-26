package java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortInt {

    public static void main(String[] args) {
        //Given a list of integers, sort all the values present in it using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        List<Integer> collect = myList.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect.toString());
    }
}

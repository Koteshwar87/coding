package java8practice;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {

    public static void main(String[] args) {

        //Given a list of integers, find out all the even numbers exist in the list using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

        myList.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }
}

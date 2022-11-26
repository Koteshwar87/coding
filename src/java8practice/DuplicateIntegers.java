package java8practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateIntegers {

    public static void main(String[] args) {
        // How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> myList = Arrays.asList(1,1,1,1,1,1);

        Set<Integer> set = new HashSet<>();
        myList.stream()
                .filter(num -> !set.add(num))
                .forEach(System.out::println);
    }
}

package leetcode.easy.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntArrayCustomSort {
    public static void main(String[] args) {
        int[] ia = {99, 11, 7, 21, 4, 2};
        ia = Arrays.stream(ia).
                boxed().
                sorted((a, b) -> a.compareTo(b)). // sort descending
                mapToInt(i -> i).
                toArray();
        System.out.println(Arrays.toString(ia));

        List<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(12);
        arr.add(223);
        arr.add(56);
        arr.add(13);
        arr.add(67);
        arr.add(2312);
        arr.add(987);
        Collections.sort(arr, (ele1, ele2) -> {
            return ele1-ele2;
        });
        arr.stream().forEach(System.out::println);
    }
}

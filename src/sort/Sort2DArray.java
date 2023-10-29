package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sort2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[4][2];
        arr[0][0] = 1;
        arr[0][1] = 4;
        arr[1][0] = 2;
        arr[1][1] = 3;
        arr[2][0] = 4;
        arr[2][1] = 6;
        arr[3][0] = 8;
        arr[3][1] = 9;

        Arrays.sort(arr, Comparator.comparingInt(o -> o[1]));

//        System.out.println(Arrays.stream(arr).toArray());

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(4);
        list.add(l1);

        l1 = new ArrayList<>();
        l1.add(2);
        l1.add(3);
        list.add(l1);

        l1 = new ArrayList<>();
        l1.add(4);
        l1.add(6);
        list.add(l1);

        l1 = new ArrayList<>();
        l1.add(8);
        l1.add(9);
        list.add(l1);

        Collections.sort(list, Comparator.comparing((a) -> a.get(1) ));

        System.out.println(list);
    }
}

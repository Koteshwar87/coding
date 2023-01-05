package leetcode.easy.sorting;

import java.util.*;

public class RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int len = arr1.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < len; i++){
            hm.put(arr1[i], hm.getOrDefault(arr1[i], 0) +1);
        }

        /*List<Integer> ll = new ArrayList<>();
        ll.*/
        ArrayList<Integer> sortedKeys
                = new ArrayList<>(hm.keySet());


        return null;
    }

    public static void main(String[] args) {

    }
}

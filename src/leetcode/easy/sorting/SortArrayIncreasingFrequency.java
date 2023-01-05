package leetcode.easy.sorting;

import java.util.Collections;
import java.util.Hashtable;

public class SortArrayIncreasingFrequency {

    public static int[] frequencySort(int[] nums) {
        int len = nums.length;
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        for(int i = 0; i < len; i++){
            if(ht.containsKey(nums[i])){
                ht.put(nums[i], ht.get(nums[i])+1);
            }else{
                ht.put(nums[i], 1);
            }
        }
        /*Collections.sort(ht, (key1, key2) -> {

        });*/
        return null;
    }

    public static void main(String[] args) {

    }
}

package leetcode.easy.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {

        int len = nums.length;
        Integer[] arr = new Integer[len];
        for (int i = 0; i < len; i++){
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (ele1, ele2) -> {
            return Integer.compare(ele1%2, ele2%2);
        });
        for (int i = 0; i < len; i++){
            nums[i] = arr[i];
        }
        return nums;
    }

    public static void main(String[] args) {

    }
}

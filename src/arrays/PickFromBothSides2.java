package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PickFromBothSides2 {
    public static int solve(ArrayList<Integer> A, int B) {

        int size = A.size();

        int maxSum = Integer.MIN_VALUE, currentSum=0;
        int maxEle = Integer.MIN_VALUE;
        for(int i=0; i < B; i++){
            currentSum += A.get(i);
            maxEle = Math.max(maxEle, A.get(i));
        }

        if(B == size)
            return currentSum;
        else if(B == 1)
            return maxEle;

        int l = 1, r = B;
        while(l < size){
            System.out.println("l = " + l + " r = " + r);
            if(r > size-1)
                r = 0;
            currentSum = currentSum - A.get(l-1) + A.get(r);
            maxSum = Math.max(maxSum, currentSum);
            l++;
            r++;

        }
        return maxSum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        /*arr.add(5);
        arr.add(-2);
        arr.add(3);
        arr.add(1);
        arr.add(2);*/
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        /*int[] intarr = new int[]{-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447,
                726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35};
        Arrays.stream(intarr).forEach(ele -> {
            arr.add(ele);
        });*/
        System.out.println("ans = " + solve(arr, 3));
    }
}

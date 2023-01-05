package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PickFromBothSides3 {
    public static int solve(ArrayList<Integer> A, int B) {
        {
            int len = A.size();

            int sum = 0;
            for(int i = 0; i < B; i++)
                sum += A.get(i);
            System.out.println("initial sum = " + sum);

            int start = len-1, end = B-2;
            int maxSum = sum;
            while(end >= -1){
                /*if(end == -1)
                    sum = sum - A.get(0) + A.get(start);
                else*/
                    sum = sum - A.get(end+1) + A.get(start);
                System.out.println("sum = " + sum);
                maxSum = Math.max(sum, maxSum);

                start--;
                end--;
            }
            return maxSum;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447,
                726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35));
        /*arr.add(5);
        arr.add(-2);
        arr.add(3);
        arr.add(1);
        arr.add(2);*/
        /*arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);*/
        /*int[] intarr = new int[]{-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447,
                726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35};
        Arrays.stream(intarr).forEach(ele -> {
            arr.add(ele);
        });*/
        System.out.println("size = " + arr.size());
        System.out.println("ans = " + solve(arr, 48));
    }
}

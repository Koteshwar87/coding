package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PickFromBothSides {
    public static int solve(ArrayList<Integer> A, int B) {

        int len = A.size();
        int roationCount = 0;
        int sum = findSum(A, B);
        System.out.println("initial sum = " + sum);
        int newSum;
        while(roationCount < len){

            reverse(A, 0, len-1);
            reverse(A, 1, len-1);
            A.stream().forEach(System.out::print);
            System.out.println();
            newSum = findSum(A, B);
            System.out.println("newSum = "+ newSum);
            sum = newSum>sum?newSum:sum;
            roationCount++;
        }
        return sum;
    }

    private static int findSum(ArrayList<Integer> arr, int B){
        int sum = 0;
        for(int i = 0; i < B; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    private static void reverse(ArrayList<Integer> arr, int start, int end){
        // int start = 0, end = arr.size()-1;
        int temp;
        while(start < end){
            temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
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
        int[] intarr = new int[]{-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447,
                726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35};
        Arrays.stream(intarr).forEach(ele -> {
            arr.add(ele);
        });
        System.out.println("ans = " + solve(arr, 48));
    }
}

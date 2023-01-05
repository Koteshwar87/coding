package arrays;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayWith2ExtraSpaces {

    public static ArrayList<Integer> solve(final List<Integer> A) {

        //With extra space

        ArrayList<Integer> result = new ArrayList<>(A.size());
        int[] arr = new int[A.size()];

        int start = 0, end = A.size()-1;

        while(start <= end){
            arr[start] = A.get(end);
            arr[end] = A.get(start);
            start++;
            end--;
        }
        for(int i = 0; i < arr.length; i++)
            result.add(arr[i]);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);

        System.out.println(solve(ll));
    }
}

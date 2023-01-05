package arrays;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayWith1ExtraSpace {

    public static ArrayList<Integer> solve(final List<Integer> A) {

        ArrayList<Integer> result = new ArrayList<>(A);
//        result.stream().forEach(System.out::println);
//        System.out.println("size = " + result.size());

        int start = 0, end = A.size()-1;
        int temp;
        while (start < end){
            temp = result.get(start);
            result.set(start, result.get(end));
            result.set(end, temp);
            start++;
            end--;
        }

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

package arrays;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayWithoutExtraSpace {

    public static void solve(List<Integer> A) {

        int start = 0, end = A.size()-1;
        int temp;
        while (start < end){
            temp = A.get(start);
            A.set(start, A.get(end));
            A.set(end, temp);
            start++;
            end--;
        }
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
        System.out.println("Before changes");
        ll.stream().forEach(System.out::print);
        solve(ll);
        System.out.println();
        System.out.println("After changes");
        ll.stream().forEach(System.out::print);
    }
}

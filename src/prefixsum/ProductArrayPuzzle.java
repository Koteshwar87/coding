package prefixsum;

import java.util.ArrayList;
import java.util.Collections;

public class ProductArrayPuzzle {

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int[] pfProd = new int[A.size()];
        int[] sfProd = new int[A.size()];
        int len = A.size();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(len, 0));
//        ans.stream().forEach(System.out::println);

        pfProd[0] = A.get(0);
        for(int i = 1; i < len; i++){
            pfProd[i] = pfProd[i-1] * A.get(i);
        } // 1 2 6 24 120

        sfProd[len-1] = A.get(len-1);
        for(int i = len-2; i >= 0; i--){
            sfProd[i] = sfProd[i+1] * A.get(i);
        } // 120 120 60 20 5

        ans.set(0, (sfProd[1])); // 0
        ans.set(len-1, (pfProd[len-2]));  // 4
        for(int i = 1; i < len-1; i++){  // 1 to 3
            System.out.println("i = " + i);
            ans.set(i, (pfProd[i-1] * sfProd[i+1]));
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);

        System.out.println(solve(A));
    }
}

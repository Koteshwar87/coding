package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ChristmasTrees {

    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        int len = A.size();
        final int inf = (int)(1e9 + 10);
        int totalMinCost = inf;

        for(int i = 0; i < A.size(); i++){
            int current = A.get(i);
            int leftCost = inf;

            for(int j = 0; j < i; j++){
                if(A.get(j) < current){
                    leftCost = Math.min(leftCost, B.get(j));
                }
            }

            int rightCost = inf;
            for(int k = i+1; k < len; k++){
                if(current < A.get(k)){
                    rightCost = Math.min(rightCost, B.get(k));
                }
            }
            System.out.println("leftCost = " + leftCost + " rightCost = " + rightCost);
            int tempCost = inf;
            if(leftCost != inf && rightCost != inf){
                tempCost = 0;
                tempCost += B.get(i);
                tempCost += leftCost;
                tempCost += rightCost;
            }
            totalMinCost = Math.min(totalMinCost, tempCost);
            System.out.println("totalMinCost = " + totalMinCost);
        }
        if(totalMinCost == inf)
            return -1;

        return (int)totalMinCost;
    }

    public static void main(String[] args) {
        System.out.println("ans = " + solve(new ArrayList<Integer>(Arrays.asList(1, 3, 5)), new ArrayList<Integer>(Arrays.asList(1,2,3))));
    }
}

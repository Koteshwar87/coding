package slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayLeastAvg {

    private static int solve(ArrayList<Integer> A, int B) {
        int len = A.size();

        float avg, leastAvg;
        long sum = 0L;
        for(int i = 0; i < B; i++){
            sum += (long) A.get(i);
        }

        if(B == len){
            return 0;
        }
        avg = (float) sum/B;
        leastAvg = avg;
         System.out.println("initial avg = " + leastAvg);

        int resultIdx = 0;

        int start = 1, end = B;
        while(end < len){

            sum = sum - A.get(start-1) + A.get(end);
            avg = (float)sum/B;
             System.out.println("next avg = " + leastAvg + " A.get(start) = " + A.get(start) + " A.get(end) = " + A.get(end) + " start = " + start + " end = " + end);

            if(avg < leastAvg){
                resultIdx = start;
                leastAvg = avg;
            }

            start++;
            end++;
        }

        return resultIdx;
    }

    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11));
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(20, 1, 5, 2, 7, 5, 17 ));
        System.out.println(solve(arr, 6));

    }
}

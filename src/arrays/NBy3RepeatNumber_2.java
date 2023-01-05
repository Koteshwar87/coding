package arrays;

import java.util.Arrays;
import java.util.List;

public class NBy3RepeatNumber_2 {

    static int appearsNBy3(int arr[], int n){

//        int n = arr.size();
        int count1 = 0, count2 = 0;

        // take the integers as the maximum
        // value of integer hoping the integer
        // would not be present in the array
        int first =  Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            // if this element is previously
            // seen, increment count1.
            if (first == arr[i])
                count1++;

                // if this element is previously
                // seen, increment count2.
            else if (second == arr[i])
                count2++;

            else if (count1 == 0) {
                count1++;
                first = arr[i];
            }

            else if (count2 == 0) {
                count2++;
                second = arr[i];
            }

            // if current element is different
            // from both the previously seen
            // variables, decrement both the
            // counts.
            else {
                count1--;
                count2--;
            }
        }
        System.out.println("first = " + first + " second = " + second + " count1 = " + count1 + " count2 = " + count2);
        count1 = 0;
        count2 = 0;

        // Again traverse the array and
        // find the actual counts.
        for (int i = 0; i < n; i++) {
            if (arr[i] == first)
                count1++;

            else if (arr[i] == second)
                count2++;
        }

        if (count1 > n / 3)
            return first;

        if (count2 > n / 3)
            return second;

        return -1;
    }

    public static int repeatedNumber(final List<Integer> a) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        int count1 = 0, count2 = 0;
        int len = a.size();

        for(int i = 0; i < len; i++){

            if(first == a.get(i)){
                count1++;
            }else if(second == a.get(i)){
                count2++;
            }else if(count1 == 0){
                first = a.get(i);
                count1=1;
            }else if(count2 == 0){
                second = a.get(i);
                count2 = 1;
            }else {
                count1--;
                count2--;
            }
        }
        System.out.println("first = " + first + " second = " + second + " count1 = " + count1 + " count2 = " + count2);
        count1=0;
        count2=0;
        for(int i = 0; i < len; i++){
            if(a.get(i) == first)
                count1++;

            if (a.get(i) == second)
                count2++;
        }
        if(count1 > len/3)
            return first;

        if(count2 > len/3)
            return second;

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(repeatedNumber(Arrays.asList(1, 1, 1, 2, 3, 5, 7 )));
        int arr[] = { 1, 1, 1, 2, 3, 5, 7  };
        int n = arr.length;
//        System.out.println(appearsNBy3(arr, n));
    }
}

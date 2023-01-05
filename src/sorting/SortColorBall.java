package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortColorBall {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(Arrays.asList(2, 0, 0, 2, 2, 1, 1, 1, 0));

        /*A.sort((lhs, rhs) -> {
            return lhs-rhs;
        });
        System.out.println(A);*/

        // Bubble sort
        /*for (int i = 0; i < A.size(); i++){
            for (int j = i+1; j < A.size(); j++){
                if(A.get(i) > A.get(j)){
                    //swap
                    int temp = A.get(i);
                    A.set(i, A.get(j));
                    A.set(j, temp);
                }
            }
        }
        System.out.println(A);*/
        int len = A.size();
        int ptr1 = 0, ptr2 = len-1;
        for (int i = 0; i < len; i++){
            if (A.get(i) != 0){
                ptr1 = i;
                break;
            }
        }
        for (int i = len-1; i >= 0; i--){
            if (A.get(i) != 2){
                ptr2 = i;
                break;
            }
        }
        int temp = 0;
        for (int i = ptr1; i <= ptr2; i++){
            int current = A.get(i);
            System.out.println("i = " + i);
            if (current == 0){
                temp = A.get(ptr1);
                A.set(ptr1, current);
                A.set(i, temp);
                ptr1++;
            }else if(current == 2){
                temp = A.get(ptr2);
                A.set(ptr2, current);
                A.set(i, temp);
                ptr2--;
            }
            System.out.println(A);
        }
        System.out.println("ans = " + A);
    }
}

package matrices;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintOuterBoxElements {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        arr.add(temp);
        temp = new ArrayList<>(Arrays.asList(6,7,8,9,10));
        arr.add(temp);
        temp = new ArrayList<>(Arrays.asList(11,12,13,14,15));
        arr.add(temp);
        temp = new ArrayList<>(Arrays.asList(16,17,18,19,20));
        arr.add(temp);
        temp = new ArrayList<>(Arrays.asList(21,22,23,24,25));
        arr.add(temp);

//        System.out.println(arr);
        int rowSize = arr.size();
        int colSize = arr.get(0).size();

        for (int i = 0; i < colSize; i++){
            System.out.print(arr.get(0).get(i) + " ");
        }
//        System.out.println();
        for (int i = 1; i < rowSize; i++){
            System.out.print(arr.get(i).get(colSize-1) + " ");
        }
//        System.out.println();
        for (int i = colSize-2; i >= 0; i--){
            System.out.print(arr.get(rowSize-1).get(i) + " ");
        }
//        System.out.println();
        for (int i = rowSize - 2; i > 0; i--){
            System.out.print(arr.get(i).get(0) + " ");
        }
    }
}

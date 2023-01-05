package matrices;

import java.util.ArrayList;
import java.util.Arrays;

public class RowToColumnZero {

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i = 0; i < A.size(); i++){
            result.add(new ArrayList<>(A.get(i)));
        }
        System.out.println(result);
        int num;
        int rows = A.size();
        int cols = A.get(0).size();
        for(int i = 0; i < rows; i++){
            System.out.println(A.get(i));
            for(int j = 0; j < cols; j++){
                num = A.get(i).get(j);
                System.out.println("i,j " + i + "," + j + " num = " + num);
                if(num == 0){
                    modifyRowColumn(i, j, result);
                }
            }
        }
        return result;
    }

    private static void modifyRowColumn(int row, int col, ArrayList<ArrayList<Integer>> arr){

        // Fixed row and all columns 0's
        for(int i = 0; i < arr.get(0).size(); i++){
            arr.get(row).set(i, 0);
        }

        // Fixed column and all rows 0's
        for(int i = 0; i < arr.size(); i++){
            arr.get(i).set(col, 0);
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<Integer>(Arrays.asList(97, 18, 55, 1, 50, 17, 16, 0, 22, 14)));
        arr.add(new ArrayList<Integer>(Arrays.asList(58, 14, 75, 54, 11, 23, 54, 95, 33, 23)));
        arr.add(new ArrayList<Integer>(Arrays.asList(73, 11, 2, 80, 6, 43, 67, 82, 73, 4)));
        arr.add(new ArrayList<Integer>(Arrays.asList(61, 22, 23, 68, 23, 73, 85, 91, 25, 7)));
        arr.add(new ArrayList<Integer>(Arrays.asList(6, 83, 22, 81, 89, 85, 56, 43, 32, 89)));
        arr.add(new ArrayList<Integer>(Arrays.asList(0, 6, 1, 69, 86, 7, 64, 5, 90, 37)));
        arr.add(new ArrayList<Integer>(Arrays.asList(10, 3, 11, 33, 71, 86, 6, 56, 78, 31)));
        arr.add(new ArrayList<Integer>(Arrays.asList(16, 36, 66, 90, 17, 55, 27, 26, 99, 59)));
        arr.add(new ArrayList<Integer>(Arrays.asList(67, 18, 65, 68, 87, 3, 28, 52, 9, 70)));
        arr.add(new ArrayList<Integer>(Arrays.asList(41, 19, 73, 5, 52, 96, 91, 10, 52, 21)));

        ArrayList<ArrayList<Integer>>  result = solve(arr);
        System.out.println(result);
    }
}

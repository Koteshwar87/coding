package subarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequenceRecursion {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5, 7, 9));
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(Arrays.asList()));
        ans = solve(ans, 0, arr);
        System.out.println(ans);
    }

    private static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> result, int idx, ArrayList<Integer> arr){

        if(idx > arr.size()-1){
            return result;
        }

        ArrayList<ArrayList<Integer>> updatedResult = new ArrayList<>(result);
        for (ArrayList<Integer> ele : result){
//            updatedResult.add(ele);
            ArrayList<Integer> temp = new ArrayList<>(ele);
            temp.add(arr.get(idx));
            updatedResult.add(temp);
        }
//        System.out.println("updated" + updatedResult);
        return solve(updatedResult, idx+1, arr);

    }
}

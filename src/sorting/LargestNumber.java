package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumber {

    public static String largestNumber(final List<Integer> A) {
        String ans = "";
        ArrayList<String> temp = new ArrayList<>();
        for(Integer ele : A){
            temp.add(String.valueOf(ele));
        }

        Collections.sort(temp, (ele1, ele2) -> {
            if(Double.valueOf(ele1+ele2) > Double.valueOf(ele2+ele1)){
                return -1;
            }else
                return 1;
        });

        System.out.println(temp.toString());
        return null;
    }

    public static void main(String[] args) {
        largestNumber(Arrays.asList(3, 30, 34, 5, 9)); //2, 3, 9, 0

    }
}

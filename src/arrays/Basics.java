package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basics {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(978, 847, 95, 729, 778, 586, 188, 782, 813, 870, 871, 940, 312, 693, 580, 101, 760, 837, 564, 633, 680, 155, 241, 374, 682, 290, 850, 601, 433, 922, 773, 959, 530, 290, 990, 50, 516, 409, 868, 131, 664, 851, 721, 880, 20, 450, 745, 387, 787, 823, 392, 242, 674, 347, 65, 135, 819, 324, 651, 678, 139, 940));
//        System.out.println(arr.size());
        int len = arr.size();
        for (int i = 0; i < len; i++){
//            System.out.println(" i = " + i + " ele = " + arr.get(i));
        }
//        System.out.println(arr.get(len/2));
//        System.out.println("------------------------------------------");
//        arrayListCopy();

        arrayMaximumSize();

    }

    private static void arrayMaximumSize() {
        int[] arr = new int[(int)1e9];
    }

    private static void arrayListCopy(){
        ArrayList<ArrayList<Integer>> first = new ArrayList<>();
        first.add(new ArrayList<>(Arrays.asList(3,4,65)));
        first.add(new ArrayList<>(Arrays.asList(24,5,57,7)));
        first.add(new ArrayList<>(Arrays.asList(34,6,7,34,243)));
        first.add(new ArrayList<>(Arrays.asList(253,364,25356,3567)));

        ArrayList<ArrayList<Integer>> second = new ArrayList<>();
        for (ArrayList<Integer> ele : first){
//            System.out.println(ele);
            second.add(ele);
        }
        System.out.println("Second");
        for (ArrayList<Integer> ele : second){
            System.out.println(ele);
        }
        second.add(new ArrayList<>(Arrays.asList(6,47,254,367756)));
        for (ArrayList<Integer> ele : second){
            System.out.println(ele);
        }

        System.out.println("first");
        for (ArrayList<Integer> ele : first){
            System.out.println(ele);
        }


    }
}

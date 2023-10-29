package recursion.basics;

import java.util.ArrayList;

public class PassByReference {
    public static void main(String[] args) {
//        addElement(new ArrayList<>(), 2);
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(2);
        System.out.println("temp = " + temp);
        add(temp);
        System.out.println("after call temp = " + temp);
    }

    private static void addElement(ArrayList<Integer> arr, int size){
        if(arr.size() == 2){
            return;
        }
        arr.add(1);
        addElement(arr, size);
        arr.remove(arr.size()-1);
        System.out.println(arr);
    }

    private static ArrayList<Integer> add(ArrayList<Integer> arr){
        arr.add(22);
        return arr;
    }
}















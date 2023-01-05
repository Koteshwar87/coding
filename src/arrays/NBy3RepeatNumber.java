package arrays;

import java.util.Arrays;
import java.util.List;

public class NBy3RepeatNumber {

    public static int repeatedNumber(final List<Integer> a) {

        int len = a.size();
        int element = a.get(0);
        int count = 1;
        for(int i = 1; i < len; i++){
            if(a.get(i) == element){
                count++;
            }else if(count == 0){
                element = a.get(i);
                count = 1;
            }else{
                count--;
            }
        }
        int freq = 0;
        for(int item : a){
            if(item == element)
                freq++;
        }
        System.out.println("freq = " + freq + " element = " + element);
        if(freq > len/3)
            return element;
        else
            return -1;
    }

    public static void main(String[] args) {
        System.out.println(repeatedNumber(Arrays.asList(1, 1, 1, 2, 3, 5, 7 )));
    }
}

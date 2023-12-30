package heap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        Map<Integer, Integer> map = new HashMap<>();
//        map.merge()
        Thread add = new Thread(()-> System.out.println());
    }
}

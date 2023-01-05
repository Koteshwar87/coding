package leetcode.easy.arrays;

import java.util.*;

public class HighFive {

    public static int[][] highFive(int[][] items) {

        // Form HashTable
        Hashtable<Integer, List<Integer>> scoresTable = new Hashtable<>();

        int rowsSize = items.length;
        int colSize = items.length;
//        scoresTable.pu

        for(int i = 0 ; i < rowsSize; i++){
            int[] score = items[i];

            /*if(scoresTable.containsKey(score[0])){
                scoresTable.computeIfPresent(score[0], (k, v) -> {
                    v.add(score[1]);
                    return v;
                });
            }else {
                scoresTable.putIfAbsent(score[0], new ArrayList<Integer>(score[1]));
            }*/
            if(scoresTable.containsKey(score[0])){
                List<Integer> scoresArray = scoresTable.get(score[0]);

//                System.out.println("scoresArray = " + scoresArray);
                scoresArray.add(score[1]);

                scoresTable.put(score[0], scoresArray);
            }else{
//                System.out.println("score[0] = " + score[0] + "score[1] = " + score[1]);
                List<Integer> newElement = new ArrayList<>();
                newElement.add(score[1]);
                scoresTable.put(score[0], newElement);
            }
        }

        Set<Integer> tableKeys = scoresTable.keySet();

        for (Integer key: tableKeys){
            System.out.println(scoresTable.get(key));
        }

        int[][] result = new int[scoresTable.size()][];
        int i = 0;
        for (Integer key: tableKeys){
            List<Integer> studentScores = scoresTable.get(key);
            Collections.sort(studentScores);
            int scoreSum = 0, avg = 0;
            /*for (int i=0; i < 5; i++){
                scoreSum += studentScores.get(i);
            }*/
            avg = scoreSum/5;

//            result[i] = {{key, avg}};
            i++;
        }
        return null;
    }

    public static void main(String[] args) {

        int[][] arr = { {1,2}, {2,3}, {1,4}, {2,6}};
        highFive(arr);
    }
}

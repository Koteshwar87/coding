package leetcode.easy.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class KWeakestRows {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int rowCount = mat.length;
        int colCount = mat[0].length;
        int[] temp;
         int[][] rowSoldiers = new int[rowCount][2];
        for(int i = 0; i < rowCount; i++){
            temp = mat[i];
            int j = 0;
            for(j = 0; j < colCount; j++){
                if(temp[j] == 0)
                    break;
            }
            rowSoldiers[i][0] = i;
            rowSoldiers[i][1] = j;
        }
        Arrays.sort(rowSoldiers, (ele1, ele2) -> {
            return ele1[1] - ele2[1];
        });
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = rowSoldiers[i][0];
        }
        return result;
    }

    public static void main(String[] args) {

    }
}

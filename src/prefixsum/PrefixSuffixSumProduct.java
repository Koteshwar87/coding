package prefixsum;

import java.util.Arrays;

public class PrefixSuffixSumProduct {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5};
        System.out.println("Initial Array");
        Arrays.stream(arr).forEach(ele -> {
            System.out.print(" " + ele);
        });
        System.out.println();
        System.out.println();

        // Prefix Sum
        int[] pfSum = new int[5];
        pfSum[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            pfSum[i] = pfSum[i-1] + arr[i];
        }
        System.out.println("Prefix Sum");
        Arrays.stream(pfSum).forEach(ele -> {
            System.out.print(" " + ele);
        });
        System.out.println();
        System.out.println();

        // Suffix Sum
        int[] sfSum = new int[5];
        sfSum[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--){
            sfSum[i] = sfSum[i+1] + arr[i];
        }
        System.out.println("Suffix Sum");
        Arrays.stream(sfSum).forEach(ele -> {
            System.out.print(" " + ele);
        });
        System.out.println();
        System.out.println();

        // Prefix Product
        int[] pfProd = new int[5];
        pfProd[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            pfProd[i] = pfProd[i-1] * arr[i];
        }
        System.out.println("Prefix Product");
        Arrays.stream(pfProd).forEach(ele -> {
            System.out.print(" " + ele);
        });
        System.out.println();
        System.out.println();

        // Suffix Product
        int[] sfProd = new int[5];
        sfProd[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--){
            sfProd[i] = sfProd[i+1] * arr[i];
        }
        System.out.println("Suffix Product");
        Arrays.stream(sfProd).forEach(ele -> {
            System.out.print(" " + ele);
        });
    }
}

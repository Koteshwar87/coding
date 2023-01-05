package leetcode.easy.bitmanipulations;

public class DivideArrayIntoEqualPairs {

    public boolean divideArray(int[] nums) {
        int len = nums.length;
        int xor = nums[0];
        for(int i = 1; i < len; i++){
            xor = xor^nums[i];
        }
        if(xor != 0)
            return false;
        else
            return true;
    }


    public static void main(String[] args) {
//        int[] arr = new int[]{9,9,19,10,9,12,2,12,3,3,11,5,8,4,13,6,2,11,9,19,11,15,9,17,15,12,5,14,12,16,18,16,10,3,8,9,16,20,2,4,16,12,11,14,20,16,2,18,17,20,3,13,16,17,1,1,11,20,20,4};
        int[] arr = new int[]{12,12,12,12,11,11,11,11,11,12};
        int xor = arr[0];
        for (int i = 1; i < arr.length; i++){
            xor = xor^arr[i];
        }
        System.out.println(xor);
    }
}

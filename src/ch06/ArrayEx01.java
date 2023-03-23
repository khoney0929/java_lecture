package ch06;

public class ArrayEx01 {
    public static void main(String[] args) {
//        int[] nums = {4,5,6};

        int[] nums = new int[3];
        nums[0] = 4;
        nums[1] = 5;
//        nums[2] = 6;

        for(int i = 0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}

package main.java.week4;

import java.util.Arrays;

public class RotateArray {

    public static int[] rotateArray(int[] nums, int k) {

        k = k % nums.length;

        int[] rotated = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int newPosition = (i + k) % nums.length;
            rotated[newPosition] = nums[i];
        }

        return rotated;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println(Arrays.toString(
                rotateArray(nums, k)));
    }
}
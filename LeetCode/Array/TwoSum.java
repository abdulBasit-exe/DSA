package LeetCode.Array;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 */
public class TwoSum {
    public void twoSum(int[] nums, int target) {
        int[] ans= new int[2];
        int first, second;
        for (int i=0; i<nums.length;i++){
            first = nums[i];
            for (int j =0;j<nums.length;j++){
                second = nums[j];
                if(target == first+second){
                   ans = new int[]{i, j};
                    break;
                }
            }
        }
        System.out.println("["+ans.toString()+"]");
    }

    public static void main(String[] args) {
        TwoSum ans = new TwoSum();
        int[] arr = {3,2,4};
        ans.twoSum(arr,6);

    }
}

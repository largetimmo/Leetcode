package question1;

public class Solution {
    public int[] twoSum(int[] nums, int target){
        int sum = 0;
        int [] result = {};
        for (int i = 0; i<nums.length-1;i++){
            sum = nums[i];
            result = new int[]{i};
            for(int k = i+1; k<nums.length;k++){
                sum+=nums[k];

                if(sum == target){
                    result = addToArray(result,k);
                    break;
                }
                sum-=nums[k];
            }
            if(sum == target && result.length==2){
                break;
            }
        }
        return result;
    }
    public int[] addToArray(int[] prevArr, int num){
        int[] newArr = new int[prevArr.length+1];
        int index = 0;

        for(int i:prevArr){
            newArr[index++] = i;
        }
        newArr[index] = num;
        return newArr;
    }
}
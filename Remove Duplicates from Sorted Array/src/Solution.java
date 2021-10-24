class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int n = nums[0],k = nums.length;

        for(int i = 1,j = 1; i < nums.length; i++){
            if(nums[i] > n){
                nums[j] = nums[i];
                n = nums[i];
                j++;
            }else{
                k--;
            }
        }

        //Print
        for(int i = 0; i < nums.length-k; i++){
            System.out.print(nums[i]+",");
        }

        return k;
    }
}
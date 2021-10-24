class FastSolution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int arrPointer = nums.length - 1;
        for(int i = 0,j = nums.length-1; i <= j;){

            if(nums[i] * nums[i] > nums[j] * nums[j]){
                arr[arrPointer] = nums[i] * nums[i];
                i++;
            }else{
                arr[arrPointer] = nums[j] * nums[j];
                j--;
            }
            arrPointer--;

        }

        return arr;
    }
}
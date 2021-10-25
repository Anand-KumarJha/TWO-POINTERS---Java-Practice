class Solution {
    public int trap(int[] height) {
        int water = 0,left = 0, right = height.length-1,current;
        while(left < right){
            if(height[left] <= height[right]){
                current = left;
                while(height[current] > height[++left]){
                    water += height[current] - height[left];
                }
            }else{
                current = right;
                while(height[current] > height[--right]){
                    water += height[current] - height[right];
                }
            }
        }return water;
    }
}
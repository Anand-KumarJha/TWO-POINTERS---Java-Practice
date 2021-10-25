import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> t2;

        if(nums.length < 3){
            return list;
        }
        for(int i = 0,j = 1,k = 2; i < nums.length;){
            if(nums[i] + nums[j] + nums[k] == 0){
                t2 = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                t2.sort(Integer::compareTo);

                if(!list.contains(t2)){
                    list.add(t2);
                }
            }
            if(k != nums.length-1){
                k++;
            }else{
                if(j+1 != nums.length-1){
                    j++;
                    k = j + 1;
                }else{
                    i++;
                    j = i + 1;
                    k = j + 1;
                    if(k >= nums.length){
                        break;
                    }
                }
            }

        }return list;
    }
}
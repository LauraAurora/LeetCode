class Solution {
    public int removeDuplicates(int[] nums) {
        
        int start = 0;
        //   i
        //[0,1,1,1,1,2,2,3,3,4]
        //   s 
        for(int i = 1; i < nums.length; i++)
        { 
            if(nums[start] != nums[i])
            {
                ++start; 
                nums[start] = nums[i];
            } 
        }
        return start + 1;
    }
}

//  s i 
// [1,1,2]

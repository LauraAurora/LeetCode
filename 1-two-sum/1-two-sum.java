//Assuming that we can have a negative integers and a negative target
//Assuming that the array only contains whole integers and nothing more
//Assuming that there is always a solution
//Is there dupicated values? Yes
//Empty array, return empty array


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            int remainder = target - nums[i];
            if(map.containsKey(remainder))
            {
                return new int[] {i, map.get(remainder)};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}

/*
    [3,2,4]  target = 6
    remainder = 2
    
    (3, 0)
    (2, 1)
    return  (2, 1)
    
    
*/
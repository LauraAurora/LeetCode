        
        //If empty array? return false
        //Can I assume negative numbers? Yes
        //Can I assume that I'm only going to be workig with whole numbers? Yes

//HashSet (No duplicates of keys or values) Space: O(n)
//Two for-loops Time: O(n^2)                Space: O(1)
    //Arrays.sort Time: O(nlogn)


class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        if(nums.length == 0 || nums.length == 1)
        {
            return false;
        }
        
        HashSet<Integer> hash = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            if(!hash.contains(nums[i]))
            {
                hash.add(nums[i]);
            }
            else
                return true;
        }
        return false;
    }
}

//Time: O(n)
//Space: O(n)
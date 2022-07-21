import java.util.Collections;


class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        quickSort(nums, 0, nums.length - 1);
        
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
        
        return nums[nums.length - k];
    }
    
    public int parition(int[] nums, int start, int end)
    {
      
    // pivot
    int pivot = nums[end]; 
      
    // Index of smaller element and
    // indicates the right position
    // of pivot found so far
    int i = (start - 1); 
  
    for(int j = start; j <= end - 1; j++)
    {
          
        // If current element is smaller 
        // than the pivot
        if (nums[j] < pivot) 
        {
              
            // Increment index of 
            // smaller element
            i++; 
            swap(nums, i, j);
        }
    }
    swap(nums, i + 1, end);
    return (i + 1);
    }
    
    public void quickSort(int[] nums, int start, int end)
    {
        if(start < end)
        {
            int par = parition(nums, start, end);
            quickSort(nums, start, par - 1);
            quickSort(nums, par + 1, end);
        }
    }
    
    public void swap(int[] nums, int s, int e)
    {
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }
}

    
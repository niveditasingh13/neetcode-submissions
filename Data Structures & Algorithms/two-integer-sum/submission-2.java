class Solution {
    public int[] twoSum(int[] nums, int target) {

       
        Map<Integer,Integer> m1=new HashMap<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     m1.put(nums[i],i);
        // }
        for(int i=0;i<nums.length;i++)
        {
            int val=target-nums[i];
            if(m1.containsKey(val))
            {
              int[] arr= new int[]{m1.get(val),i};
              Arrays.sort(arr);
              return arr;
            }
            
            m1.put(nums[i],i);
            
            
        }
        
        return new int[0];
        
    }
}

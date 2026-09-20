class Solution {
    public boolean hasDuplicate(int[] nums) {

        Map<Integer,Integer> M1=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            M1.put(nums[i],M1.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> E1:M1.entrySet())
        {
            if(E1.getValue()>1) return true;
        }
        return false;
        
    }
}
class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> s1=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            s1.add(nums[i]);
        }
        if(s1.size()!=nums.length)  return true;
        else return false;
        
    }
}
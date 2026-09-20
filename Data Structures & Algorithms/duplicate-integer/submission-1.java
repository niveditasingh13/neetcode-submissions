class Solution {
    public boolean hasDuplicate(int[] nums) {

        //create a  map
        Map<Integer,Integer> M1=new HashMap<>();
        //fill map
        for(int i=0;i<nums.length;i++)
        {
            int key=nums[i];
            M1.put(key,M1.getOrDefault(key,0)+1);
        }
        //iterate map
        for(Map.Entry<Integer,Integer> e1:M1.entrySet())
        {
            if(e1.getValue()>1) return true;
        }
        return false;
    }
}
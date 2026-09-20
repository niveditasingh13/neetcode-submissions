class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        //step 1 count the frequency
        Map<Integer,Integer> M1=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            M1.put(nums[i],M1.getOrDefault(nums[i],0)+1);
        }
        //step 2 create a priority qeueu that stores Map entry and sort in descending order
        //create max heap
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        //step 3 add all entry
        pq.addAll(M1.entrySet());
        //craete answer array
        int[] ans=new int[k];
        //iterate pq till k
        for(int i=0;i<k;i++)
        {
            ans[i]=pq.poll().getKey();
        }
        return ans;
        
       

    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> m1=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String s=strs[i];  //actual val
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String s1=new String(ch); //sorted value
            if(m1.containsKey(s1))
            {
                m1.get(s1).add(s);
            }
            else
            {
                List<String> l1=new ArrayList<>();
                l1.add(s);
                m1.put(s1,l1);
            }
        }
        return new ArrayList<>(m1.values());

        
    }
}

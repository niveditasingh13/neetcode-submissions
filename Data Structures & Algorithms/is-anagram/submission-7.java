class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())  return false;
        Map<Character,Integer> m1=new HashMap<>();
        //fill the map
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            m1.put(ch,m1.getOrDefault(ch,0)+1);

        }
        //take the other string
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            if(!m1.containsKey(ch))  return false;
            else
            {
                if(m1.get(ch)<1)  
                {
                   System.out.println(m1.get(ch));
                   return false;
                }
                
                int val=m1.get(ch);
                m1.put(ch,--val);
            }
        }
        return true;

    }
}

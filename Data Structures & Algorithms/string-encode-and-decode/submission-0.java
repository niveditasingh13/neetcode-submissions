class Solution {

    public String encode(List<String> strs) {
        
        StringBuilder encoded=new StringBuilder();
        for(String s:strs)
        {
            encoded.append(s.length());
            encoded.append("#");
            encoded.append(s);
        }
        
        return new String(encoded);

    }

    public List<String> decode(String str) {

        List<String> result=new ArrayList<>();
        int i=0;
        int len=str.length();
        while(i<len)
        {
            char ch=str.charAt(i);
            int num=0;
            while(str.charAt(i) != '#')
            {
                num=num*10+str.charAt(i)-'0';
                i++;

            }
            i++;
            result.add(str.substring(i,num+i));
            i=num+i;
        }

        return result;

        
    }
}

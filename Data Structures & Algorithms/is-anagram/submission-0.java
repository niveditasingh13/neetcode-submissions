class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            s=s.replace(ch+"","");
            t=t.replace(ch+"","");
            if(s.length()!=t.length()) return false;
        }
        return true;

    }
}

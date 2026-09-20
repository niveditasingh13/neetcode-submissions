class Solution {
    public boolean isPalindrome(String s) {

        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        System.out.println(s);
        char[] ch=s.toCharArray();
        int l=0;
        int h=ch.length-1;
        while(l<=h)
        {
            if(ch[l]!=ch[h])  return false;
            l++;
            h--;
        }
        return true;
        
    }
}

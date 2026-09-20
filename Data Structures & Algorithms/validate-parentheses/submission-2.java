class Solution {

    public boolean isCheck(char ch1,char ch2)
    {
        if(ch1=='{'&&ch2=='}')  return true;
        else if(ch1=='['&& ch2==']')  return true;
        else if(ch1=='('&& ch2==')')  return true;
        return false;
    }
    public boolean isValid(String s) {

        Stack<Character> s1=new Stack<>();
        if(s.length()==1)  return false;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='{'||ch=='['||ch=='(')
            {
                s1.push(ch);
            }
            else
            {
                if(s1.isEmpty())  return false;
                char ch1=s1.pop();
                 if(!isCheck(ch1,ch))  return false;

            }
        }

        return s1.isEmpty();
        
    }
}

class Solution {
    public boolean isPalindrome(String s) 
    {
       StringBuilder sb=new StringBuilder();
       for(char i:s.toCharArray())
       {
          if(Character.isLetter(i)||Character.isDigit(i))
          {
            sb.append(i);
          }
       }    
       return pali(sb.toString().toLowerCase());
    }
    static boolean pali(String str)
    {
       int i=0,j=str.length()-1;
       while(i<=j)
       {
        if(str.charAt(i)!=str.charAt(j)) return false;
        i++;
        j--;
       }
       return true;
    }
}

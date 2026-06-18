class Solution {
    public boolean isAnagram(String s, String t)
    {
       int[] f1=new int[26];
       for(char i:s.toCharArray()) f1[i-'a']++;
       for(char i:t.toCharArray()) f1[i-'a']--;
       for(int i=0;i<26;i++)
       {
         if(f1[i]!=0)
         {
            return false;
         }
       }
       return true;
    }
}

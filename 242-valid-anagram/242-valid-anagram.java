//What is s or t is empty? return true
//Check to make sure that the length of both s and t are equal
//Unicode characters?
//Is there a mix of uppercase and lowercase characters?

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length())
            return false;
       
        int [] counter = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        
        for(int i = 0; i < counter.length; i++)
        {
            if(counter[i] != 0)
                return false;
        }
        
        return true;
    }
}
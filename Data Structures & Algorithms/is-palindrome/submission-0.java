class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        
      int length = s1.length();
        if(length%2 == 0){
            String part2even = new StringBuilder(s1.substring(length/2,length)).reverse().toString();
             if(s1.substring(0,length/2).equals(part2even))
            {return true;}
            else
                return false;
            
        }
        else{
            String part2 = new StringBuilder(s1.substring(length/2+1,length)).reverse().toString();
             if(s1.substring(0,length/2).equals(part2))
            {return true;}
            else
                return false;
            
        }
        
    }
}

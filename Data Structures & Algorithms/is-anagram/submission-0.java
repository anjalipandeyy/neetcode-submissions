class Solution {
    public boolean isAnagram(String s, String t) {
          boolean isAnagramResult = false;
        if(s.equals(t)){
            return true;
        }
        if(s.length() == t.length()){
            char[] s1 = s.toCharArray();
            char[] t1 = t.toCharArray();
           Arrays.sort(s1);
           Arrays.sort(t1);
           if(new String(s1).equals(new String(t1))){
               isAnagramResult = true;
           }

        }

       return isAnagramResult;
    }

}

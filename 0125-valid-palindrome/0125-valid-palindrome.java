class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true;
        String res = "";
        for(int i =0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                res+=s.charAt(i);
            }
        }
        res = res.toLowerCase();
        int low=0;
        int high = res.length()-1;
        while(low<=high){
            if(res.charAt(low)!=res.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
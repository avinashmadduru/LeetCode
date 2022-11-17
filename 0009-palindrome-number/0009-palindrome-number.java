class Solution {
    public boolean isPalindrome(int x) {
       if(x==0)
        return true;
       else if(x<0 || x % 10 == 0)
        return false;
       int reverse = 0;
       while(x>reverse){
           int t = x %10;
           x/=10;

           reverse = (reverse * 10) + t;
       }
       if(x==reverse || x==reverse/10)
        return true;
       else
        return false;
    }
}
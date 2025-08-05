class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long n=0;
        long copy=x;
        while(copy){
            n=(copy%10)+(n*10);
            copy=copy/10;
        }
        return(n==x);
    }
};
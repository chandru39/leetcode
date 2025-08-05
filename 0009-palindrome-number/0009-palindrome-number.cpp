class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0){
           return false;
        }
        long reversed=0;//121
        int y=x;//1
         while(y>0){
            reversed=reversed*10+y%10;//1
            y/=10;
         }
         return reversed==x;
    }
};
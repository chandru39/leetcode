class Solution {
public:
    int maxProfit(vector<int>& prices) {
       int sellone=0;
       int holdone=INT_MIN;
       for(const int price :prices){
        sellone=max(sellone,holdone+price);
        holdone=max(holdone,-price);
       } 
       return sellone;
    }
};
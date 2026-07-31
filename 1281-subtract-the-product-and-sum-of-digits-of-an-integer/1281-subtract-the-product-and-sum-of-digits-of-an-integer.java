class Solution {
    public int subtractProductAndSum(int n) {
        int newnum=0;
        int product =1;
        int sum =0;
        while(n>0){
            int digit = n%10;
            n = n/10;
            sum = sum+digit;
            product = digit*product;
              
        }
        return product-sum;
        
    }
}
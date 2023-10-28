class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        boolean isNegative = dividend<0 ^ divisor<0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int quotient = 0;
        while(dividend-divisor>=0){
            int currdiv = divisor;
            int curq = 1;
            while(dividend - (currdiv << 1) >=0){
                currdiv = currdiv<<1;
                curq = curq<<1;
                
            }
            quotient += curq;
            dividend -= currdiv;
        }
        
        return isNegative? -quotient : quotient;
        
        
    }
}
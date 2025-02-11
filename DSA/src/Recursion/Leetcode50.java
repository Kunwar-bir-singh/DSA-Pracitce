class Solution {
    public double myPow(double x, int n) {

        if( n < 0){
            n = -n; // minus minus plus
            x = 1 / x;
        }
        double res = 1;
        while(n != 0){
           if ((n & 1) != 0){
                res = res * x;
            }
            x *= x;
            n >>>= 1;
        }
        return res;
    }
}
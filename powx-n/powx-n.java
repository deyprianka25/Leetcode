class Solution {
    public double myPow(double x, int n) {
        //RECURSIVE
       if (n == Integer.MIN_VALUE) {
            if (x == 1.0 || x == -1.0) {
                return 1.0; 
            } else {
                return 0.0;  
            }
        }
        if (x == 0 && n < 0) {
            throw new ArithmeticException("Cannot raise 0 to a negative power.");
        }

        if (n == 0) {
            return 1.0;  
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        if (n % 2 == 0) {
            double half = myPow(x, n / 2);
            return half * half;
        } else {
            return x * myPow(x, n - 1);
        }
    }
}
//ITERATIVE
       //if (n < 0) {
           // n = -n;
           // x = 1 / x;
       // }
    //double result = 1.0;
        
       // while (n != 0) {
            //if (n % 2 != 0) {
               // result = result * x;
           // }
            //x = x * x;
            //n = n / 2;
       // }
        
       // return result;
    //}
//}
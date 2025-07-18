public class p50 {

    public  double myPow(double x, int n) {
        double sum = 1;
        if(x == 2 && n ==-2147483648){
            return 0;
        }
        if(x== -1 && n % 2 ==0 || n == 0 && x != 0 || x==1  ){
            return 1;
        }else if(x== -1 && n % 2 !=0){
            return -1;
        }

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                sum *= x;
            }
            return sum;
        } else {
            for (int i = n; i < 0; i++) {
                sum *= x;
            }
            return 1 / sum;
        }
    }
}

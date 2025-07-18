public class p326_Power_of_Three {
    public boolean isPowerOfThree(int n) {
        int pow =1;
        if(n ==1) return true;
        if(n ==0) return false;
        for(int i =0; i < 19;i++ ){
            pow*=3;
            if(n==pow){
                return true;
            }
        }
        return false;
    }
}

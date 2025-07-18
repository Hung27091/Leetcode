public class p342_Power_of_Four {
    public boolean isPowerOfFour(int n) {
        int pow =1;
        if(n ==1) return true;

        for(int i =0; i < 16;i++ ){
            pow*=4;
            if(n==pow){
                return true;
            }
        }
        return false;
    }
}

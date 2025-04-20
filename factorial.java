public class program19 {
    static int factorial( int n){
      int res = 1;
        for( int i = 2; i <= n; i ++)
            res *= i;
           return res ;
        }
        public static void main(String args[]){
            int n = 10;
            System.out.println("the factorial num is: "+ n + " is " + factorial(10));

        }
}

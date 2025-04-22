public class swap {
    public static void main (String[]args){
        int a = 10;
        int b = 20;
// swapingtwonumbersbyusingthirdvariable
        int temp = a;
             a = b;
             b = temp;
             System.out.println("after swaping a:"+a);
             System.out.println("after swaping b:"+b);
//swapingtwonumberswithoutusingthirdvariable
         a = a - b;
         b = a + b;
         a = b - a;
         System.out.println("after swaping a:"+a);
         System.out.println("after swaping b:"+b);
    }
}

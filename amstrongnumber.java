package extensions;

public class amstrongnum {
    public static void main(String args[]){
        int n = 370;
        int temp = n;
        int r,sum = 0;
          while(n > 0)
          {
            r = n % 10;
            n = n / 10;
            sum = sum + r*r*r;
          }
          if(temp == sum)
          {
            System.out.println("amstrong number");
          }
          else
          {
            System.out.println("not amstrong number");
          }

    }
}

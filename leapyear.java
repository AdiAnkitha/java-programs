public class program16 {
  public static void isLeapYear(int Year){
    boolean is_leap_year = false;
    if(Year % 4 == 0){
        is_leap_year =true;
        if(Year % 100 == 0){
            if(Year % 400 == 0)
              is_leap_year = true;
            else
                is_leap_year = false;
        }
    }
    else
      is_leap_year = false;
      if(!is_leap_year)
        System.out.println( "  Non Leap-year" + Year);
     else
        System.out.println( " :leap-year" + Year);
    } 
    public static void main(String args[]){
        isLeapYear(2024);
         isLeapYear(2026);
    } 
}

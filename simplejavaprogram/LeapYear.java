package simplejavaprogram;
class LeapYear 
{
    public static void main(String [] args)
    {
    int year = 2924 ;
    String op =
    ((year%4==0)&&((year%400==0)||(year%100!=0) ))?
    (year+"is a leap year"): (year+"is a not leap year");
    System.out.println(op);
   }
}
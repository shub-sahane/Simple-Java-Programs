package simplejavaprogram;
class ProductOfNumber
{
    public static void main(String [] args)
    {
        int num=333;
        int multi=1;

        int rem=num%10;
        multi=multi*rem;
        num=num/10;
        rem=num%10;
        multi=multi*rem;
        num=num/10;
        rem=num%10;
        multi=multi*rem;
        System.out.println(multi);
    }
}
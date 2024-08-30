package simplejavaprogram;
// Write a java program to display character is Uppercase or Not.
class Alphabets
{
    public static void main(String [] args)
    {
        char ch = 'A';
        //Using ASCII codes if char is greather than 65 and smaller than 90 then it is UpperCase Alphabet.
        String  output= (ch>=65 && ch<=90)? (ch+" is an Upper case Alphabet  ") : (ch+" is an not Uppercase alphabet ");
        System.out.println(output);
    }
}
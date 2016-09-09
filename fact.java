import java.util.Scanner;
 
class Fact
{
   public static void main(String args[])
   {
      int n, i, f = 1;
 
      System.out.println("Enter an integer to calculate it's factorial");
      Scanner in = new Scanner(System.in);
 
      n = in.nextInt();
 
      if ( n < 0 )
         System.out.println("Number should be non-negative.");
      else
      {
         for ( i = 1 ; i <= n ; i++ )
            f = f*i;
 
         System.out.println("Factorial of "+n+" is = "+fact);
      }
   }
}

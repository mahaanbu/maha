import java.util.*;
 
class ReverseString
{
   public static void main(String args[])
   {
      String a, rev = "";
      Scanner in = new Scanner(System.in);
 

      a = in.nextLine();
 
      int length = a.length();
 
      for ( int i = length - 1 ; i >= 0 ; i-- )
         rev = rev+ a.charAt(i);
 
      System.out.println("Reverse of entered string is: "+rev);
   }
}

import java.util.Scanner;

public class Alekszandra
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Write in a number: ");
      int first = keyboard.nextInt();
      System.out.println("Write in an another number: ");
      int second = keyboard.nextInt();

      int sum = first + second;
      int multiply = first * second;

      System.out.println("Write in the sum of " + first + " and " + second);
      int sumk = keyboard.nextInt();
      System.out.println(
            "Write in the multiplication of " + first + " and " + second);
      int multiplyk = keyboard.nextInt();

      if (multiply == multiplyk && sum == sumk)
      {
         System.out.println(
               "You are awesome Alekszandra, you had 2/2 good answers!!!");
      }
      else if (multiply == multiplyk && sum != sumk
            || multiply != multiplyk && sum == sumk)
      {
         System.out.println(
               "You have one good answer, this is very good for the first time Alekszandra!!!");
      }
      else if (multiply != multiplyk && sum != sumk)
      {
         System.out.println(
               "You failed as always, but you are still easily awesome...");
      }

   }

}

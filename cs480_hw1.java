//1.__________________________________________________
public class MyClass {
    public static void main(String args[]) {
      int sum = 0;
      for(int i = 0; i < args.length; i++){
          sum += Integer.parseInt(args[i]);
      }
      System.out.println("Sum of numbers: " + sum);
    }
}

//2._________________________________________________
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner stdin;
        stdin = new Scanner(System.in);
        int x,y,tmp;
        //Step1: Reading
        System.out.print("Insert first number: ");
        x = stdin.nextInt();
        System.out.print("Insert second number: ");
        y = stdin.nextInt();
        //Step2: Switching
        tmp = x;
        x = y;
        y = tmp;
        //Step3: Printing
        System.out.println("__________________________________\nNow the first number is: " + x);
        System.out.println("Now the second number is: " + y);
   /* Step 1: Read two numbers */
   /* Step 2: Switch the two numbers */
   /* Step 2: Print the siwtched two numbers */
    }
}


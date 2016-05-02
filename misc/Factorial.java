import java.util.Scanner;

/**
 * Created by Amit on 02-May-16.
 */
public class Factorial {
    static int fact = 1;

    public static int factorial(int n){
        for (int i=n;i>0;i--){
            fact = fact*i;
        }
        return fact;
    }

    public static int factorialUsingRecursion(int n){
        if(n==0)
            return 1;
        else
            return n*factorialUsingRecursion(n-1);
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to calculate the factorial :");
        int n = scanner.nextInt();
        System.out.println("factorial of "+n+" is:"+factorial(n));
        System.out.println("factorial of "+n+" using recursion is:"+factorialUsingRecursion(n));
    }
}

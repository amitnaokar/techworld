import java.util.Scanner;

/**
 * Created by Amit on 02-May-16.
 */
public class Swap {
    int a;
    int b;

    Swap(){

    }

    Swap(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void swapNumbers(){
        System.out.println("Before swapping\t a:"+a+" b:"+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("after swapping\t a:"+a+" b:"+b);
    }

    public static void main(String args[]){
        Swap swap = new Swap(5,10);
        swap.swapNumbers();

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value of a");
        swap.a = scanner.nextInt();
        System.out.println("enter value of b");
        swap.b = scanner.nextInt();
        swap.swapNumbers();

    }

}

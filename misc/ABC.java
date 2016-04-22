/**
 * Created by Amit on 21-Apr-16.
 */
import java.util.Scanner;
import java.lang.Math;

public class ABC {
    public static void main(String []args) {
        String num;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Feed me with numbers!");
            num = scanner.nextLine();
            try {
                String[] numStr = num.split(" ");
                int num1 = Integer.parseInt(numStr[0]);
                int num2 = Integer.parseInt(numStr[1]);
                int result = (int) Math.pow(num1, num2);
                System.out.println("result:"+result);
                System.out.println("Keep Going!");
                System.out.println(num);
                throw new Exception("exception");
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("Exception");
            }
        }

    }
}

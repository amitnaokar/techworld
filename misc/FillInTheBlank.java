import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Amit on 21-Apr-16.
 */
public class FillInTheBlank {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("String a:");
        String a = scanner.nextLine();
        List<String> aList = Arrays.asList(a.split(" "));

        System.out.println("String b:");
        String b = scanner.nextLine();
        List<String> bList = Arrays.asList(b.split(" "));

        ArrayList<String> resultList = new ArrayList<String>();

        for (int i=0;i<aList.size();i++){
            if(!bList.contains(aList.get(i))){
                resultList.add(aList.get(i));
            }
        }

        String[] result = resultList.toArray(new String[resultList.size()]);
        for(int i=0;i<result.length;i++){
            System.out.println((i+1)+". "+result[i]);
        }
    }
}

import java.util.*;
import java.util.ArrayList;

public class ArrayLists {


    public static void main(String [] arg) {
        int i, n;
        Scanner fg = new Scanner(System.in);
        System.out.println("the value of n is");
        n = fg.nextInt();
        String[] str = new String[n];
        System.out.println("the values of string are: ");
        for (i = 0; i < n; i++) {
            str[i] = fg.next();
        }
        for (String names : str) {
            System.out.print(names + " ");
        }
        System.out.println(" ");
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Simran sharma");
        for (i = 0; i < n; i++) {
            arr.add(str[i]);
        }
        System.out.println("Here is our array which take input from existing array and is dynamic in nature ");
        for (i = 0; i < n+1; i++) {
            System.out.print(arr.get(i)+" ");
        }
    }
}

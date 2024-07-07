import java.util.*;
import java.util.ArrayList;
public class ArrayList {


    public static void main(String [] arg){
        int i,n;
        Scanner fg = new Scanner(System.in);
        n=fg.nextInt();
        String[] str = new String[n];
        for (i=0;i<n;i++){
            str[i]=fg.next();
        }
        for (String names : str){
            System.out.print(names+" ");
        }
        ArrayList<String> arr = new ArrayList<>();
    }
}

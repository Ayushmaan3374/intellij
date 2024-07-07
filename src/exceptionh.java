import java.util.*;
public class exceptionh {
    public static void main(String[] ui){
        Scanner ne = new Scanner(System.in);
        int d=ne.nextInt();
        try{
            if(d==0)
                throw new ArithmeticException();
            }
        catch(Exception ar){
            System.out.println(ar);
        }
    }
}

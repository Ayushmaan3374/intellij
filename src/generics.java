import java.util.*;
public class generics {
    public static void main(String[] arg){
        // for generic classes in java we need to define new objects with new datatype evey time.
        System.out.println("by generic classes");
        generictype<Integer> news = new generictype<>();
        news.printf(23);
        generictype<String> news1 = new generictype<>();
        news1.printf("ayushmaan");
        // for generic methods me can use methods directly without defining the datatype in it.
        System.out.println("by generic function");
        nameprint("ayushmaan");
        nameprint(45);
        nameprint(34.2323);

        // for two types of generic datatype in one method
        show("simran","jethwani");
        show("ayushmaan","sharma");
        show("simran",20);
        show("ayushmaan",19);
    }
    public static <t> t nameprint(t names){
        System.out.println(names);
        return names;
    }
    // if method have two different types of generics presents in it
    public static < u,v > v show(u name,v names){
        System.out.println(name +" "+names);
        return names;
    }

}

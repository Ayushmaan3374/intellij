interface u{
    static void manu() {
            System.out.println("calling another interface");
        }
}
interface me extends u{
    void area();
}

public class inter implements me{
    @Override
    public void area() {
    int c = 5*6;
        System.out.println(c);
}
    public static void main(String[] args) {
        inter i=new inter();
        u.manu();
        i.area();
    }

}

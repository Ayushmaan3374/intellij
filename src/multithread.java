public class multithread {
    public static void main(String [] arg){
        int i;
        for( i=0;i<=3;i++){
            multythreading my = new multythreading();
            Thread my1 = new Thread(my);
            my1.start();
        }

    }
}

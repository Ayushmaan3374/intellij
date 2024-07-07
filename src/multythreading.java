public class multythreading implements Runnable {
    public void run() {
        int i;
        for (i = 0; i <=6; i++) {
            System.out.println(i);
        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
    }
}
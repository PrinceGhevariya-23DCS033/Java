
public class Practical35 implements Runnable {

    private int value;

    public Practical35(int initialValue) {
        this.value = initialValue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        value++;
        System.out.println("Value after increment: " + value);
    }

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
        Practical35 task = new Practical35(i); 
        Thread thread = new Thread(task);
        thread.start();
        }
    }
}

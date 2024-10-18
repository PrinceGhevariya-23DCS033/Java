
import java.util.Random;

class rendomnum extends Thread {

     Thread sqthread;
     Thread cuthread;

    public rendomnum(Thread sqthread, Thread cuthread) {
        this.sqthread = sqthread;
        this.cuthread = cuthread;
    }

    public void run() {
        Random rand = new Random();
        while (true) {
            int ranint = rand.nextInt(100);
            System.out.println("Generated number: " + ranint);
            if (ranint % 2 == 0) {
                sqcal.setnumber(ranint);
                sqthread.run();
            } else {
                cubecal.setnumber(ranint);
                cuthread.run();
            }
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class sqcal implements Runnable {

    private static int number;

    public static void setnumber(int number) {
        sqcal.number = number;
    }

    public void run() {
        System.out.println("Square of " + number + " is " + (number * number));
    }
}

class cubecal implements Runnable {

    private static int number;

    public static void setnumber(int number) {
        cubecal.number = number;
    }

    public void run() {
        System.out.println("Cube of " + number + " is " + (number * number * number));
    }
}

public class Practical34 {

    public static void main(String[] args) {
        Thread sqthread = new Thread(new sqcal());
        Thread cuthread = new Thread(new cubecal());
        rendomnum rng = new rendomnum(sqthread, cuthread);
        rng.start();
    }
}

class Practical36 implements Runnable {
    private String threadName;

    public Practical36(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName + " is running with priority " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        
        Practical36 first = new Practical36("FIRST");
        Practical36 second = new Practical36("SECOND");
        Practical36 third = new Practical36("THIRD");

        
        Thread t1 = new Thread(first);
        Thread t2 = new Thread(second);
        Thread t3 = new Thread(third);
         

        
        t1.setPriority(3);
        t2.setPriority(Thread.NORM_PRIORITY); 
        t3.setPriority(7);

      
        t1.start();
        t2.start();
        t3.start();
    }
}
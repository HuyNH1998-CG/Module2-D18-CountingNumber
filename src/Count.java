public class Count implements Runnable {
    private Thread thread;

    public Count() {
        thread = new Thread(this, "a thread");
        System.out.println("Created" + thread);
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("print count " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException exception){
            System.out.println("thread interrupted");
        }
        System.out.println("thread died");
    }
}

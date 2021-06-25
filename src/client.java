public class client {
    public static void main(String[] args) {
        Count count = new Count();
        try {
            while ((count.getThread().isAlive())){
                System.out.println("Main thread run till child die");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e){
            System.out.println("Main interrupted");
        }
        System.out.println("Ded");
    }
}

public class NewThreadEx  extends Thread{
    NewThreadEx() {
        // create a new second thread
        super("Demo Thread");
        System.out.println("Child Thread:  " + this);
    }

    // this is the entry point for the second thread 
    public void run() {
        try {
            for(int i = 0; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted");
        }
        System.out.println("Existing child thread")

    }
}

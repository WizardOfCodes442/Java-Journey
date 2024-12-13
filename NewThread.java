// create a second thread
public class NewThread  implements Runnable {
    String name;
    Thread t;

    NewThread(String threadname) {
        // create a new second thread
        
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Child thread: " + t);

    }

    // this is the entry point for the second thread
    public void run () {
        try {
            for (int i = 5; i > 0; i --) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted.");
        }
        System.out.println("Exiting child thread");
    }
}

public class MultiThreadDemo {
    public static void main (String args[]) {
        NewThreadMulti nt1 = new NewThreadMulti("one");
        NewThreadMulti nt2 = new NewThreadMulti("two");
        NewThreadMulti nt3 = new NewThreadMulti("three");

        //start all the 3 threads 
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        try {
            // wait for other threads to end 
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
    }
}

public class ThreadClassDemo {
    public static void main(String[] args) {
        Thread t1 = new Workers();
        Thread t2 = new Workers();
        Thread t3 = new Workers();
        t1.start();
        t2.start();
        t3.start();
    }
}
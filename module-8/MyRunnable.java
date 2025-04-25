
// Steve Stylin Module 8 DIscussion Board
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Task is running in a separate thread.");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}

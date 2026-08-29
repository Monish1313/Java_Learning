// -------- Thread Class 1 --------
class NumberThread extends Thread {
    private volatile boolean running = true;

    public void run() {
        try {
            for (int i = 1; i <= 10 && running; i++) {
                System.out.println("NumberThread : " + i);
                Thread.sleep(1000);   // sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("NumberThread interrupted");
        }
    }

    public void stopThread() {
        running = false;
    }
}

// -------- Thread Class 2 --------
class AlphabetThread extends Thread {
    private volatile boolean running = true;

    public void run() {
        try {
            for (char c = 'A'; c <= 'J' && running; c++) {
                System.out.println("AlphabetThread : " + c);
                Thread.sleep(1000);   // sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("AlphabetThread interrupted");
        }
    }

    public void stopThread() {
        running = false;
    }
}

// -------- Main Class --------
public class T43_Threads {

    public static void main(String[] args) {

        NumberThread t1 = new NumberThread();
        AlphabetThread t2 = new AlphabetThread();

        System.out.println("Main thread started");

        // start both threads
        t1.start();
        t2.start();

        

        // stop both threads
        System.out.println("Stopping both threads...");

        System.out.println("Main thread ends");
    }
}

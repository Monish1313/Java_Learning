// -------- Shared Class --------
class SharedCounter {

    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

// -------- Thread Class 1 --------
class NumberThread extends Thread {

    SharedCounter counter;

    NumberThread(SharedCounter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 1; i <= 50000; i++) {
            counter.increment();
        }
    }
}

// -------- Thread Class 2 --------
class AlphabetThread extends Thread {

    SharedCounter counter;

    AlphabetThread(SharedCounter counter) {
        this.counter = counter;
    }

    public  void run() {
        for (int i = 1; i <= 50000; i++) {
            counter.increment();
        }
    }
}

// -------- Main Class --------
public class T45_Threads_join_synchronized {

    public static void main(String[] args) throws InterruptedException {

        SharedCounter counter = new SharedCounter(); // ONE shared object

        NumberThread t1 = new NumberThread(counter);
        AlphabetThread t2 = new AlphabetThread(counter);

        System.out.println("Main thread started");

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Count : " + counter.count);
        System.out.println("Main thread ends");
    }
}

package multithread_10.multithread_1;

class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("1");
            Thread.sleep(1000);
            System.out.println("2");
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MultiThreadTest {
    public static void main(String[] args) {
      Thread myThread = new MyThread();
      myThread.run();
    }
}

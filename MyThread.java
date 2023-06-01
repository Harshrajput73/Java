
    public class MyThread implements Runnable {
        public void run() {
            // code to be executed in this thread
        }
    
        public static void main(String[] args) {
            MyThread myThread = new MyThread();
            Thread thread = new Thread(myThread);
            thread.start(); // start the thread
        }
    }
    


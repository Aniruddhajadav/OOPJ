 class OddThread implements Runnable { 
    public void run() { 
        for (int i = 1; i <= 50; i++) { 
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
                try { 
                    Thread.sleep(100); 
                } catch (InterruptedException e) { 
                    System.out.println(e); 
                } 
            } 
        } 
    } 
}

class EvenThread implements Runnable { 
    public void run() { 
        for (int i = 1; i <= 50; i++) { 
            if (i % 2 == 0) { 
                System.out.println("Even: " + i);
                try { 
                    Thread.sleep(100); 
                } catch (InterruptedException e) { 
                    System.out.println(e); 
                } 
            } 
        } 
    } 
}

public class p14_EvenOddThread { 
    public static void main(String[] args) {
        Thread t1 = new Thread(new OddThread()); 
        Thread t2 = new Thread(new EvenThread()); 

        t1.start();
        t2.start(); 
    }
}
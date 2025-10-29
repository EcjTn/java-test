package SynchroTests;

public class SynchroThing implements Runnable {
    String uri;

    public SynchroThing(String uri) {
        this.uri = uri;
    }

    @Override
    public synchronized void run() {
        for(int i = 0; i < 6; i++) {
            System.out.println("My URI IS: " + uri + " " + Thread.currentThread().getName() + " > " + i);
            try {
                Thread.sleep(1150);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(i == 5) {
                System.out.println("[" + Thread.currentThread().getName() + "]" + " Finished.");
            }

        }
    }

}

import SynchroTests.SynchroThing;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws Exception {

        //Executor pool = Executors.newFixedThreadPool(8);
        SynchroThing synchroThing = new SynchroThing("google.com");

        Thread task1 = new Thread(synchroThing, "Thread-1");
        Thread task2 = new Thread(synchroThing, "Thread-2");

        task1.start();
        task2.start();

        throw new Exception();

    }
}
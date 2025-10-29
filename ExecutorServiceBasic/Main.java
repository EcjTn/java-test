import RunnableTask.IntroduceTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws Exception {

        ExecutorService pool1 = Executors.newFixedThreadPool(8);
        ExecutorService pool2 = Executors.newFixedThreadPool(8);

        IntroduceTask introduceTask1 = new IntroduceTask("Ecj Taneo");
        IntroduceTask introduceTask2 = new IntroduceTask("Vian");

        for(int i = 0; i < 10; i ++) {
            pool1.submit(introduceTask1);
            pool2.submit(introduceTask2);
        }
        pool1.shutdown();
        pool2.shutdown();


    }
}
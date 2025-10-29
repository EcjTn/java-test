package RunnableTask;

public class IntroduceTask implements Runnable {
    String name;

    public IntroduceTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i < 6; i++) {
            System.out.println("My Name is " + name + " " + Thread.currentThread().getName() + " > " + i);
            try {
                Thread.sleep(1100);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            if(i == 5) {
                System.out.println("[" + Thread.currentThread().getName() + "]" + " Finished.");
            }

        }
    }

}

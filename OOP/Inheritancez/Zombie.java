package Inheritancez;

public class Zombie {

    public boolean isInfected = true;
    public int virusDose = 3000;
    public boolean isHigh = true; //very.




    //Constructor
    public Zombie(boolean isHigh, int virusDose){
        this.isHigh = isHigh;
        this.virusDose = virusDose;
    }






    //methods
    public void biteAction() {
        System.out.println("This thing is biting...");
    }

    public void adaptAction() {
        System.out.println("This thing is adapting to attacks...\n");
    }

    public void introduceSelf() {
        System.out.println("Hello, i am now infected, a zomboid.");
    }

}
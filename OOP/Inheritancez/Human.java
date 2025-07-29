package Inheritancez;

public class Human extends Zombie {

    public String humaneName;


    //super with constructor
    public Human(boolean isHigh, int virusDose, String humaneName) {
        super(isHigh, virusDose);
        this.humaneName = humaneName;
    }


    @Override
    public void introduceSelf() {
        System.out.println("Hello, i am " + humaneName + " and not infected!");
    }


    //super keyword used. since introduceSelf() is Override
    public void becameZombie() {
        super.introduceSelf();
    }

}

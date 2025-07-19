package zombie;

public class Zomboid {

    //Instance variables
    public String name;
    public int virusDose;
    public String power;


    //Constructor
    public Zomboid(String name, int virusDose, String power){
        this.name = name;
        this.virusDose = virusDose;
        this.power = power;
    }


    //Methods
    public void biteAction(){
        System.out.println(this.name + " is biting with " + this.virusDose + " force");
    }


    public void introduceZomb() {
        System.out.println("My name is " + this.name + " i am badly injected with virus dose of " + this.virusDose);
        System.out.println("My power is strongly " + this.power + "...");
    }


}

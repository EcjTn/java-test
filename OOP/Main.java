import Encapsulz.Humanoid;
import Inheritancez.Human;

public class Main {
    public static void main(String[] args) {


        // Encapsulation --------------------------
        Humanoid humanoid = new Humanoid();
        humanoid.setInfo("Nooby", 234);
        humanoid.getInfo();
        // -----------------------------------------



        //Inheritance ---------------------------------
        //human inherited zombies lol
        Human human = new Human();
        human.imInfected();
        human.biteAction();
        human.adaptAction();
        // --------------------------------------------


    }
}
import Encapsulz.Humanoid;
import Inheritancez.Human;
import Inheritancez.Zombie;

public class Main {
    public static void main(String[] args) {


        // Encapsulation --------------------------
        Humanoid humanoid = new Humanoid();
        humanoid.setInfo("Nooby", 234);
        humanoid.getInfo();
        // -----------------------------------------



        //Inheritance ---------------------------------
        //human inherited zombies
        Human human = new Human(true, 22224, "Ecj");

        human.introduceSelf();
        human.becameZombie();

        human.biteAction();
        human.adaptAction();
        // --------------------------------------------


    }
}
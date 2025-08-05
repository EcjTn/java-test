import Encapsulz.Humanoid;
import Inheritancez.Human;
import Abstractionz.Car;
import Polymorphismz.MySubClass;

public class Main {
    public static void main(String[] args) {


        //    Encapsulation --------------------------
        Humanoid humanoid = new Humanoid();
        humanoid.setInfo("Nooby", 234);
        humanoid.getInfo();
        // -----------------------------------------


        //    Inheritance ---------------------------------
        //human inherited zombies
        Human human = new Human(true, 22224, "Ecj");

        human.introduceSelf();
        human.becameZombie();

        human.biteAction();
        human.adaptAction();
        // --------------------------------------------


        //    Abstraction ---------------------------------

        Car car = new Car();
        car.startingSound();

        // ------------------------------------------------



        //      Polymorphism -----------------------------

        MySubClass subClass = new MySubClass("Ecj Taneo", 16, "coding", "Adidas");
        subClass.introduceSelf();
        subClass.introduceSelf("eating");

        // ------------------------------------------------


    }
}
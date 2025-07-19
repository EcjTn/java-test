import zombie.Zomboid;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scans = new Scanner(System.in);

        System.out.print("Enter name of your zomboid: ");
        String name = scans.nextLine();

        System.out.print("Enter the amount of virus to inject: ");
        int virusDose = scans.nextInt();

        scans.nextLine(); // remove the leftover newline

        System.out.print("Enter it's power: ");
        String power = scans.nextLine();

        Zomboid zombie1 = new Zomboid(name, virusDose, power);
        zombie1.introduceZomb();
        zombie1.biteAction();

    }
}
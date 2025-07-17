import linkshore.HelperBox;
import rompack.UtilityBase;

public class Main {
    public static void main(String[] args) {

        HelperBox helpbox = new HelperBox();
        UtilityBase utilz = new UtilityBase();

        helpbox.serialize();
        HelperBox.signKey("785-9340e-arfw-36t63"); //random

        System.out.println(helpbox.addFunction(12,190));

        System.out.println(utilz.tokens);

    }
}
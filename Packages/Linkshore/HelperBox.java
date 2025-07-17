package Linkshore;

public class HelperBox {

    public void serialize(){
        System.out.println("On the way.");
    }

    public static void signKey(String key){
        System.out.println(key + " Signed...");
    }

    public int addFunction(int a, int b) {
        return a + b;
    }
}

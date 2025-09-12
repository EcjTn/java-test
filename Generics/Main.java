public class Main {
    public static void main(String[] args) {

        genericTestPrinter("Ecj");
        GenericClassTest<String> genericClassTest = new GenericClassTest<>("Hello everyone.");
        genericClassTest.printVariable();

    }

    public static <T> void genericTestPrinter(T tool){
        System.out.println(tool + " !!!");
    }

}



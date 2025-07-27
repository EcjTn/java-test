package Encapsulz;

public class Humanoid {

    private String name = "Ecj Taneo";
    private int age = 16;

    //getters
    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + '\n');
    }

    //setters
    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

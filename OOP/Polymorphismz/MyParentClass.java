package Polymorphismz;

public class MyParentClass {

    String name;
    int age;
    String hobbies;

    public MyParentClass(String name, int age, String hobbies){
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public void introduceSelf(){
        System.out.println("Hello i am " + name + " I am " + age + "yrs old!" + " my hobbies are " + hobbies);
    }

    public void showSkill() {
        System.out.println("My skill is sleeping!");
    }

    public void codingSession() {
        System.out.println("Coding with something...");
    }


}

package Polymorphismz;

public class MySubClass extends MyParentClass{

    String shirtName;

    //x super constructor
    public MySubClass(String name, int age, String hobbies, String shirtName){
        super(name, age, hobbies);
        this.shirtName = shirtName;
    }

    //Method overriding
    @Override
    public void introduceSelf(){
        System.out.println("Hey i dont wanna introduce myself but i have this shirt called " + shirtName);
    }

    //Method Overloading
    public void introduceSelf(String skills) {
        super.introduceSelf();
        System.out.println("My last skills are: " + skills);
    }

}

public class GenericClassTest<T> {
    
    T myVariable;
    
    public GenericClassTest(T myVaribale){
        this.myVariable = myVaribale;
    }
    
    public void printVariable() {
        System.out.println("Variable is: " + this.myVariable);
    }
    
}

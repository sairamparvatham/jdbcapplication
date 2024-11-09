

	class Parent{
    public static void study() {
        System.out.println("Medicine");
    }
}
class Child extends Parent{
    //Method Hiding
    public static void study() {
        System.out.println("Acting");
    }
}
public class MyCalc {
    public static void main(String[] args) {
        Parent p2 = new Child();
        p2.study();
        
        //Child c2 = (Child) new Parent();
    }
}

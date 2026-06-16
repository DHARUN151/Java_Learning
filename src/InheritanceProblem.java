import java.util.*;
class A{
    void display(){
        System.out.println("HI");
    }
}

class B extends  A{
    @Override
    void display() {
        System.out.println("Hello");
    }
}

public class InheritanceProblem {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}

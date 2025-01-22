
class Mother {
    int x = 10; 

    void show() {
        System.out.println("Hello World from Mother class.");
    }

    static void staticShow() {
        System.out.println("Static Hello World from Mother class.");
    }
}

class Child extends Mother {

    @Override
    void show() {
        System.out.println("Hello JUET from Child class.");
    }

   
    static void staticShow() {
        System.out.println("Static Hello JUET from Child class.");
    }
}


public class prob3 {
    public static void main(String[] args) {
       
        Mother m = new Mother();
        m.show(); 
        Child ch = new Child();
        ch.show(); 

        Mother m1 = new Child(); 
        m1.show(); 


        m.staticShow(); 
        ch.staticShow(); 
        m1.staticShow();
    }
}

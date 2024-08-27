public class App {
    public static void main(String[] args) throws Exception {
     Shape shape= new Circle();
     shape.draw();  
     Shape shape2 = new Rectangle();
     shape2.draw();
    }
}
abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}
//use interface for 100% abstraction cause there is declaration only  and not definition.

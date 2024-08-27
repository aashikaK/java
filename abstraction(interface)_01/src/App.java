public class App {
    public static void main(String[] args) throws Exception {
        Drawable circle= new Circle();
        circle.draw();
        Rectangle r= new Rectangle();
        r.draw();
    }
}
interface Drawable{
    void draw();
}
class Circle implements Drawable{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing Rctangle");
    }
}

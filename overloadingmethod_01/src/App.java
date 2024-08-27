public class App {
    public static void main(String[] args) throws Exception {
       Rectangle rect= new Rectangle();
       System.out.println(rect.add(2, 4));
       System.out.println(rect.add(4, 6, 7));
    }
}
//method overloading makes code more readable, should have same method name, 
//makes code more readable, written in same class name, modifier must be same, is flexible
class Rectangle{
    public int add(int x, int y){
        return x+y;
    }
    public int add(int x, int y, int z){
        return x+y+z;
    }
}

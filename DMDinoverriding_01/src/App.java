public class App {
    public static void main(String[] args){
        Animal d= new Dog();
        Dog  d1= new Dog();
        d.eat();
        d1.move();
    }
}
class Animal{
    public void eat(){
        System.out.println("Eat all edibles");
    }
}
class Dog extends Animal{
    public void eat(){
        super.eat();
        System.out.println("Dog likes eating bones");
    }
    public void move(){
        System.out.println("Dog move");
    }
}

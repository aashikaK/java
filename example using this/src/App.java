public class App {
    public static void main(String[] args) throws Exception {
       Temp t= new Temp(5,6);
    }
}
class Temp{
    public Temp(){
System.out.println("No parameter");
    }
    public Temp(int x){
this();
System.out.println("One parameter");
    }
    public Temp(int x, int y){
this(5);
System.out.println("Two parameter constructor");
    }
}

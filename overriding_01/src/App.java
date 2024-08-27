public class App {
    public static void main(String[] args) throws Exception {
        BaseClass r= new Ram();
        BaseClass S= new Shiva();
        r.GodName();
        S.GodName();
    }
}
class BaseClass{
    public void GodName(){
    System.out.println("I am God");
    }
}
class Ram extends BaseClass{
    public void GodName(){
    System.out.println("I am Ram");
    }
}
class Shiva extends BaseClass{
    public void GodName(){
        System.out.println("I am Shiva");
    }
}
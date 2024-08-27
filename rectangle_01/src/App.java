public class App {
    public static void main(String[] args) throws Exception {
       Rectangle rect= new Rectangle();
       System.out.println("Value before changing: " +rect.a);
       rect.display(500);
       System.out.println("Value after changing: " +rect.a);
    }
}
class Rectangle{
    public int a=100;
    public void display(int a){
        a=a+100;
    }
}

//ABSTRACT CLASS   FINAL CLASS   
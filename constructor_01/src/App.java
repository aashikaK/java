import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b= sc.nextInt();
     Rectangle rect= new Rectangle(a,b); 
     rect.display();
     sc.close();
    } }
class Rectangle{
    int first=0;
    int second=0;
    public Rectangle(int a, int b) //paramaterized constructor
    {
        first=a;
         second=b;
    }
        public void display()
        {
            System.out.println(first+second);
        }  }

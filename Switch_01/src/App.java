import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
            Scanner sc= new Scanner(System.in);
    System.out.println("Enter the first digit: ");
    int a=sc.nextInt();
    System.out.println("Enter second digit: ");
    int b=sc.nextInt();
    System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication and 4 for division: ");
    int opt =sc.nextInt();
    Calculation obj= new Calculation();
    switch (opt) {
        case 1:
        int add= obj.Add(a, b);
            System.out.println(add);
            break;
        case 2:
        int sub= obj.Sub(a,b);
        System.out.println(sub);
        break;
        case 3:
        int mul= obj.Mul(a,b);
        System.out.println(mul);
        break;
        case 4:
        int div= obj.Div(a, b);
        System.out.println(div);
        break;
        default:
        System.out.println("invalid option!!");
            break;
    }
    sc.close();    
} }
class Calculation{
    public int Add(int x, int y){
        return x+y;
    }
    public int Sub(int x, int y){
    return x-y;
}
    public int Mul(int x, int y){
    return x*y;
    }
    public int Div(int x, int y){
        return x/y;
    } } 


    

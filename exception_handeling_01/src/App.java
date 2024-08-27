import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);
        try{
            System.out.println("Enter first digit");
            int a=s.nextInt();
            System.out.println("Enter second digit");
            int b=s.nextInt();
            if(b==0){
                throw new ArithmeticException("cannot be dividedd by zero");
            }
            int result=a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e){
        System.out.println("Error: "+ e.getMessage());  }
        finally{
            System.out.println("Finally block executed");
            s.close();
    }
}   
}
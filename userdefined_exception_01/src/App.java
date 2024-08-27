import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);
        try{
            System.out.print("Enter your balance: ");
            double balance= s.nextDouble();
            System.out.print("Enter withdrawal amount: ");
            double withdrawal=s.nextDouble();
            if(withdrawal>balance){
                throw new MyCustomException("Insufficient balance");
            }
            double rembalance= balance- withdrawal;
            System.out.println("Remaining balnce: "+ rembalance);
        }
        catch(MyCustomException e){
            System.out.println("Error: "+ e.getMessage());
        }
        catch(Exception ex){
            System.out.println("Error"+ex.getMessage());
        }
        finally{
            s.close();
        }
    }
}
class MyCustomException extends Exception{
    public MyCustomException(String message){
        super(message);
    }   }  

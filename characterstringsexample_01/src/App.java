import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        FileReader in= null;
        FileWriter out= null;
        try{
            in= new FileReader("input.txt");
            out= new FileWriter("output.txt");
            int c;
            while((c= in.read())!=-1){
                out.write(c);
            }
        } finally{
            in.close();
            out.close();
        }
        System.out.println("File has been read successfully");
    }
}

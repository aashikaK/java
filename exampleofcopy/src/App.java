import java.io.*;
import java.nio.file.*;
public class App {
    public static void main(String[] args) throws Exception {
        String sourceFilePath="C://xampp//htdocs//web.html";
        String destinationFilePath="://xampp//htdocs//php";
        Path sourcePath=Paths.get(sourceFilePath);
        Path destinationPath=Paths.get(destinationFilePath);
        try{
            Files.copy(sourcePath,destinationPath);
            System.out.println("File copies successfully!");
        }catch(IOException e){
            System.out.println("An error occurred:"+e.getMessage());
        }
    }
}
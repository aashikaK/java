import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter String");
        String str= s.nextLine();
        s.close();
        str=str.toLowerCase();
        int vCount=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                vCount++ ;
            }
        }
        System.out.println("Number of vowels: "+vCount);
    }
}

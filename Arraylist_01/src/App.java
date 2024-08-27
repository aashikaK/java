import java.util.ArrayList;
import java.util.Iterator; 

public class App {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango"); 
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        Iterator<String> itr = list.iterator(); 
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
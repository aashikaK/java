public class App {
    public static void main(String[] args) throws Exception {
        Person person= new Person("Fourth", 19);
        String personString=person.toString();
        System.out.println("String of person object: "+personString);
    }
}
class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.name= name;
        this.age= age;
    }
    @Override
    public String toString(){
        return "{Person name= '" +name + "' ,age="+ age +"}" ;
    }
}

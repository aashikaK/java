public class App {
    public static void main(String[] args) throws Exception {
        CRUDStudent stu=new CRUDStudent();
        stu.CreateStudent(1, "Ohm Pawat", "ohmp@gmail.com", "Male");
        stu.CreateStudent(2, "Wang Yibo", "yibow@gmail.com", "Male");
        stu.CreateStudent(3, "Maya Thakur", "thakur@gmail.com", "Female");
        stu.CreateStudent(4, "Wala Kc", "wala2@gmail.com", "Male");
        stu.CreateStudent(5, "Bina Rai", "raib2@gmail.com", "Female");
        //stu.FetchStudent();
    }
}

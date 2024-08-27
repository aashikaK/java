public class App {
        public static void main(String[] args) throws Exception {
       CRUDStudent stu=new CRUDStudent();
       stu.CreateStudent(15, "Bina KC", "kcbina@gmail.com", "Female");
       stu.CreateStudent(16, "Sita Lama", "sita22@gmail.com", "Female"); 
       stu.CreateStudent(17, "Kamal Thapa", "kamal@gmail.com", "Male"); 
       stu.CreateStudent(18, "Biraj Thapa", "bthapa@gmail.com", "Male"); 
       stu.CreateStudent(19, "Maya Lama", "mayalama23@gmail.com", "Female");  
       stu.FetchStudent();
    }
}

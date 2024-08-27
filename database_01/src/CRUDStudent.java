import java.sql.*;
public class CRUDStudent {

    
    public void CreateStudent(int id, String name, String email, String gender)
     {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/swastikdb", "root", "Aashika22@");
            String sql="insert into thstudent(ID, Name, Email,Gender) values(?,?,?,?)";
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setString(3,email);
            ps.setString(4,gender);
            ps.executeUpdate();
            con.close();
            System.out.println("Data Inserted");
        }
        catch(Exception e){
            System.out.println(e);
        }
    
    }   
    }
        
    
    
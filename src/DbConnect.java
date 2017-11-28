
import java.sql.*;
import javax.swing.JOptionPane;

public class DbConnect {

public static Connection dbConnect() {

    try{
    
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\DELL\\Documents\\NetBeansProjects\\Library Management System\\LibraryManagementSystemDB.sqlite");
        return conn;
    }
    catch(Exception ex){
    
        JOptionPane.showMessageDialog(null, ex);
        return null;
    }
}
}

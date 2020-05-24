package source;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class data {
    public static Connection initializeDatabase() 
        throws SQLException, ClassNotFoundException 
    { 
        String dbDriver = "com.mysql.jdbc.Driver"; 
        String dbURL = "jdbc:mysql://localhost:3306/planner?autoRecconect=true&useSSL=false"; 
        String dbUsername = "root"; 
        String dbPassword = "9632";
        Class.forName(dbDriver); 
        Connection con = DriverManager.getConnection(dbURL, dbUsername,dbPassword); 
        return con;
    }    
}
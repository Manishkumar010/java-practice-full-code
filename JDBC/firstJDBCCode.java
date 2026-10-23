package JDBC;
import java.sql.*;

// ** creating data //

public class firstJDBCCode {
    
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        // Load and Register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Create the connection
        String url = "jdbc:mysql://localhost:3306/firstjdbc";
        String username = "root";
        String password = "root";
        Connection connect = DriverManager.getConnection(url, username, password);

        // Create the statement
        Statement statement = connect.createStatement();

        // Execute the query
        String sql = "INSERT INTO studentinfo(id, sname, sage, scity) VALUES(1, 'Rohan', 17, 'Bengaluru')";
       int rowAffected=  statement.executeUpdate(sql) ;

        // process the query
        if(rowAffected == 0)
        {
            System.out.println("Unable to insert the data");
        }
        else{
            System.out.println("Data Inserted Successfully ! ");
        }


        // close the resouces
        statement.close();
        connect.close();
    }
}

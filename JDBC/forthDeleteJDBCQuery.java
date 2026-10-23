package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class forthDeleteJDBCQuery {
       public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
        String sql = "DELETE FROM studentinfo where id = 2";
        int rowAffetcted = statement.executeUpdate(sql);
        if(rowAffetcted == 0)
            System.out.println("Failed to delete the records");
        else{
            System.out.println("Record deleted successfully !");
        }
 
        // close the resouces
        statement.close();
        connect.close();
    }
}

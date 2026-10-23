package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class secondUpdateJDBCQuery {
    
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
        String sql = "UPDATE studentinfo set sage=24 where id=2";
        int rowAffected = statement.executeUpdate(sql);
        if(rowAffected == 0)
            System.out.println("updation failed");
        else{
            System.out.println("Update successfully");
        }

        // close the resouces
        statement.close();
        connect.close();
    }
}

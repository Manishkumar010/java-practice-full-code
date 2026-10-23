package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class thirdFetchJDBCQuery {
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

        String sql = "SELECT * FROM studentinfo";
        ResultSet rs = statement.executeQuery(sql);

        while(rs.next())
        {
            // int id = rs.getInt(1);
            // System.out.println(rs.getInt(1)+ " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4));
            // we can fetch data suing column name or column numner both are working
            System.out.println(rs.getInt("id")+ " " + rs.getString("sname") + " " + rs.getInt("sage") + " " + rs.getString("scity"));
        }

        // close the resouces
        rs.close();
        statement.close();
        connect.close();
    }
}

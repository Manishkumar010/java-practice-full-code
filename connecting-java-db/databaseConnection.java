import java.sql.Connection;
import java.sql.DriverManager;


public class databaseConnection {
    public static void main(String[] args) throws Exception {
        /*
         * import package
         * load and register
         * create connection
         * create statement
         * execute statement
         * process the results
         * close
         * 
         * 
         */

        String url = "jdb:postgressql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "6031";
        // Class.forName("org.postgressql.Driver") // we can use this to

        Connection con = DriverManager.getConnection(url, uname,pass);
        System.out.println("Connection established");

    }
}

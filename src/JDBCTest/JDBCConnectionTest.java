package JDBCTest;
import java.sql.*;

public class JDBCConnectionTest {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //loads and registers the driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "confirm"); //establishes the connection
            Statement stmt = con.createStatement(); //creates the statement object
            ResultSet rs = stmt.executeQuery("select * from departments"); //Executes the resultSet query
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2));
                //System.out.println(rs.getString("first_name"));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

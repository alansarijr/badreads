import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class dbController {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Updated the driver class name
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoapp", "root", "toor");
            Statement stmnt = conn.createStatement(); // corrected the statement creation
            ResultSet rs = stmnt.executeQuery("SELECT * FROM people"); // corrected the SQL query
            
            // Handle the ResultSet as needed
            while (rs.next()) {
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }
            
            // Close ResultSet, Statement, and Connection
            rs.close();
            stmnt.close();
            conn.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(dbController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


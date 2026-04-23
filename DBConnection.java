import java.sql.*;

public class DBConnection {

    // Method to establish and return a connection to the GYM database
    public static Connection getConnection() {

        Connection con = null; 
        String url = "jdbc:mariadb://localhost:3306/GYM"; 
        String user = "root"; 
        String pwd = ""; 

        try {
            // Attempt to connect to the database
            con = DriverManager.getConnection(url, user, pwd);
            if (con != null)
                System.out.println("Connected to Gym DataBase"); // Success message
        } catch (SQLException e) {
            System.out.println("Connection failed"); // Error message
            e.printStackTrace(); // Print full error details
        }

        return con; // Return the connection object to be used by other classes
    }
}
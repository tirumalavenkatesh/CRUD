 import java.sql.*;

public class delete {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/db";
        String username = "root";
        String password = "manikanta@07";

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection con = DriverManager.getConnection(url, username, password);

            // SQL Delete Query
            String query = "DELETE FROM students WHERE id = ?";

            // Create PreparedStatement
            PreparedStatement pstmt = con.prepareStatement(query);

            // Set Student ID
            pstmt.setInt(1, 5);

            // Execute Delete
            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Record deleted successfully.");
            } else {
                System.out.println("Student ID not found.");
            }

            // Close Resources
            pstmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

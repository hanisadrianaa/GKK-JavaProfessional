package lesson10.assignment_exercise.address_book_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class AddressBookDB {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/db_address_book";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "12345";

    private Connection conn;

    public AddressBookDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addContact(String name, String phone, String address) {
        String sql = "INSERT INTO contacts (name, phone, address) VALUES (?, ?, ?)";

        try (PreparedStatement prep = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            prep.setString(1, name);
            prep.setString(2, phone);
            prep.setString(3, address);
            prep.executeUpdate();

            int generateId = -1;

            try (var rs = prep.getGeneratedKeys()) {
                if (rs.next()) {
                    generateId = rs.getInt(1);
                }
            }
            JOptionPane.showMessageDialog(null, "Successfully add new contact into database!");
            System.out.println("Added contact with ID: " + generateId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteContact(int id) {
        String sql = "DELETE FROM contacts WHERE id = ?";

        try (PreparedStatement prep = conn.prepareStatement(sql)) {
            prep.setInt(1, id);
            int rowsAffected = prep.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Successfully delete contact from database!");
            } else {
                System.out.println("Contact not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeConn() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

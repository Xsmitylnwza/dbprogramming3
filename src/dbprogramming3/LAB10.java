/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbprogramming3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class LAB10 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "mysql@sit";
        
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(URL, username, password);
                Statement statement = con.createStatement();
                String sql = "update student set email = 'xxxx@gmail.com' where studentID = '111111'";
                statement.executeUpdate(sql);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LAB10.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(LAB10.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}

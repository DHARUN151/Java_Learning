package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name = sc.next();
        sc.nextLine();

        System.out.println("Enter Student id");
        int reg_no = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        try{
            Connection con = DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/Students",
                    "root",
                    "3014"
            );

            String sql = "Insert into Info(name, reg_no, age) values (?, ?, ?)";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, name);
            pst.setInt(2, reg_no);
            pst.setInt(3, age);

            int result = pst.executeUpdate();
            if(result>0)
                System.out.println("Record Added successfully");
            pst.close();
            con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

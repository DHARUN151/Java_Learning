package DBConnection;

import java.sql.*;
import java.util.Scanner;

public class StudentCRUD {

    static final String URL = "jdbc:mysql://localhost:3306/Students";
    static final String USER = "root";
    static final String PASSWORD = "3014";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== STUDENT CRUD MENU =====");
            System.out.println("1. Insert Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    insertStudent(sc);
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    updateStudent(sc);
                    break;

                case 4:
                    deleteStudent(sc);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    // CREATE
    public static void insertStudent(Scanner sc) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            String sql = "INSERT INTO student VALUES (?, ?, ?)";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setInt(3, age);

            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Student Added Successfully!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // READ
    public static void viewStudents() {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

            String sql = "SELECT * FROM student";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            System.out.println("\nID\tNAME\tAGE");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + "\t" +
                                rs.getString("name") + "\t" +
                                rs.getInt("age")
                );
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // UPDATE
    public static void updateStudent(Scanner sc) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

            System.out.print("Enter Student ID to Update: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter New Name: ");
            String name = sc.nextLine();

            System.out.print("Enter New Age: ");
            int age = sc.nextInt();

            String sql =
                    "UPDATE student SET name=?, age=? WHERE id=?";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, name);
            pst.setInt(2, age);
            pst.setInt(3, id);

            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Student Updated Successfully!");
            } else {
                System.out.println("Student Not Found!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // DELETE
    public static void deleteStudent(Scanner sc) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

            System.out.print("Enter Student ID to Delete: ");
            int id = sc.nextInt();

            String sql = "DELETE FROM student WHERE id=?";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, id);

            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Student Deleted Successfully!");
            } else {
                System.out.println("Student Not Found!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
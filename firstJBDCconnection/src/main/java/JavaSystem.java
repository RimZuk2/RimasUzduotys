import data.Student;
import jbdc.JBDCConnector;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaSystem {
    public static void main(String[] args) {
        JavaSystem javaSystem = new JavaSystem();
        Scanner scanner = new Scanner(System.in);
        int select;
        do {
            System.out.println("____________________________");
            System.out.println("| 1. ivesti nauja studenta |");
            System.out.println("| 2. Print all students    |");
            System.out.println("| 0. Pabaiga               |");
            System.out.println("____________________________");
            select = scanner.nextInt();

            switch (select) {
                case 1:
                    javaSystem.createNewStudent(scanner);
                    break;
                case 2:
                    javaSystem.showAllStudents();
                    break;
                case 0:
                    System.out.println("Sistema baigia darba");
                    break;
                default:
                    System.out.println("Nera tokios komandos");
                    break;
            }
        } while (select != 0);
    }

    private void showAllStudents() {
        List<Student> students = new ArrayList<>();
        JBDCConnector connector = new JBDCConnector();
        Connection connect = connector.connect();
        if (connect == null) {
            return;
        }
        try {
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from students");
            while (resultSet.next()) {
                students.add(new Student(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("surname"), resultSet.getString("phone"), resultSet.getString("email")));
            }
            students.forEach(System.out::println);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

//    private void showAllStudents(Scanner scanner) {
//        List<Student> students = new ArrayList<>();
//        JBDCConnector connector = new JBDCConnector();
//        Connection connect = connector.connect();
//        if (connect == null) {
//            return;
//        }
//        try {
//            Statement statement = connect.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from students");
//            while (resultSet.next()) {
//                students.add(new Student(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("surname"), resultSet.getString("phone"), resultSet.getString("email")));
//            }
//            students.forEach(System.out::println);
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//
//    }

    private void createNewStudent(Scanner scanner) {
        System.out.println("Iveskite studento varda");
        String name = scanner.next();
        System.out.println("Iveskite studento pavarde");
        String lastname = scanner.next();
        System.out.println("Iveskite telefona");
        String phone = scanner.next();
        System.out.println("Iveskite email");
        String email = scanner.next();

        JBDCConnector connector = new JBDCConnector();
        Connection connect = connector.connect();
        if (connect == null) {
            System.out.println("Cannot create student");
            return;
        }
        try {
            PreparedStatement statement = connect.prepareStatement("insert into students(name, surname, phone, email)values(?, ?, ?, ?)");
            statement.setString(1, name);
            statement.setString(2, lastname);
            statement.setString(3, phone);
            statement.setString(4, email);

            statement.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}

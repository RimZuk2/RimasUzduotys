import data.Student;
import jbdc.JBDCConnector;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JavaConnector {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        try {
            JBDCConnector connector = new JBDCConnector();
            Connection connect = connector.connect();
            if(connect == null){
                return;
            }

            //2. Statement
            Statement statement = connect.createStatement();
            //3. Execute statement
            ResultSet resultSet = statement.executeQuery("select * from students");
            while (resultSet.next()) {
                students.add(new Student(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("phone"),
                        resultSet.getString("email")));
            }
        } catch (SQLException e) {
            System.out.println("Sql exception");
            System.out.println(e.getMessage());
        }
        students.forEach(s->{
            System.out.println(s.getId());
            System.out.println(s.getName());
            System.out.println(s.getSurname());
            System.out.println(s.getPhone());
            System.out.println(s.getEmail());
        });

    }
}

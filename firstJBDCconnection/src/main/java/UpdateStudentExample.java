import jbdc.JBDCConnector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudentExample {
    public static void main(String[] args) {
        JBDCConnector connector = new JBDCConnector();
        Connection connect = connector.connect();
        if (connect == null){
            System.out.println("Cannot conect to DB");
        }
        try {
            Statement statement = connect.createStatement();
            statement.execute("update students set name='Rimukas' where id=1");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}

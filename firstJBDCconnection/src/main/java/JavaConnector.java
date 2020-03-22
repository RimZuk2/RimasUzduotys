import java.sql.*;

public class JavaConnector {
    public static void main(String[] args) {

        try {
            //1. Sukurti connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kcs", "root", "");
            //2. Statement
            Statement statement = connection.createStatement();
            //3. Execute statement
            ResultSet resultSet = statement.executeQuery("select * from students");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
                System.out.println(resultSet.getString(4));
                System.out.println(resultSet.getString("email"));
            }

        } catch (SQLException e) {
            System.out.println("Cannot connect to DB");
            System.out.println(e.getMessage());
        }
    }
}

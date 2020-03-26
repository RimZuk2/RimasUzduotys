package com.kcs.springboot.example.service;

import com.kcs.springboot.example.data.Student;
import com.kcs.springboot.example.jdbc.JDBCConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class StudentsService {
    @Autowired
    private JDBCConnector jdbcConnector;

    public StudentsService(JDBCConnector jdbcConnector) {
        this.jdbcConnector = jdbcConnector;
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        Connection connection = jdbcConnector.createConnection();
        if (connection == null) {
            return Collections.emptyList();
        }
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from students");

            while (resultSet.next()) {
                students.add(new Student(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("phone"),
                        resultSet.getString("email")));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return students;
    }
}

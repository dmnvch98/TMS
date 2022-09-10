package com.teachmeskills.lesson20.converters;

import com.teachmeskills.lesson20.entities.Student;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentResultSetConverter {
    public Student convert(final ResultSet resultSet) {
        Student student = new Student();
        try {
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setLastName(resultSet.getString("last_name"));
        } catch (SQLException e) {
            System.out.println(e);
        }
        return student;
    }
}

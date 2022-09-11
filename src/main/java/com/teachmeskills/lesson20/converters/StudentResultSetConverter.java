package com.teachmeskills.lesson20.converters;

import com.teachmeskills.lesson20.entities.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentResultSetConverter {
    public Student convert(final ResultSet resultSet) {
        Student student = new Student();
        try {
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setLastName(resultSet.getString("last_name"));
            student.setClassId(resultSet.getInt("class_id"));
            student.setCityId(resultSet.getInt("city_id"));
        } catch (SQLException e) {
            System.out.println(e);
        }
        return student;
    }
}

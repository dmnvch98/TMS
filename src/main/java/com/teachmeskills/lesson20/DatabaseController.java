package com.teachmeskills.lesson20;

import com.teachmeskills.lesson20.converters.CityResultSetConverter;
import com.teachmeskills.lesson20.converters.StudentResultSetConverter;
import com.teachmeskills.lesson20.entities.City;
import com.teachmeskills.lesson20.entities.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DatabaseController {
    private static final String GET_STUDENTS_SQL = "SELECT * FROM school.student";
    private static final String GET_CITIES_SQL = "SELECT * FROM school.city";
    private static final String INSERT_STUDENT_SQL = "INSERT INTO `school`.`student` (`name`, `last_name`, `gender`, " +
            "`age`, `city_id`, `height`, `class_id`) VALUES (?, ?, ?, ?, ?, ?, ?);";
    private static final String INSERT_CITY_SQL = "INSERT INTO `school`.`city`(`name`, `description`, `country_id`) " +
            "VALUES (?, ?, ?);";

    private static final String DELETE_CITY = "DELETE FROM `school`.`city` where id = ?";
    private static final String DELETE_STUDENT = "DELETE FROM `school`.`student` where id = ?";
    private static final StudentResultSetConverter STUDENT_CONVERTER = new StudentResultSetConverter();
    private static final CityResultSetConverter CITY_CONVERTER = new CityResultSetConverter();
    public void addStudent(Student student) {
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
                PreparedStatement stmt = con.prepareStatement(INSERT_STUDENT_SQL);
        ) {
            prepareStatementToAddStudent(stmt, student).executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
                PreparedStatement stmt = con.prepareStatement(GET_STUDENTS_SQL);
        ) {
            ResultSet rs = stmt.executeQuery(GET_STUDENTS_SQL);
            while (rs.next()) {
                students.add(STUDENT_CONVERTER.convert(rs));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return students;
    }


    public void deleteStudent(Student student) {
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
                PreparedStatement stmt = con.prepareStatement(DELETE_STUDENT);
        ) {
            stmt.setInt(1, student.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<City> getCities() {
        List<City> cities = new ArrayList<>();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
                PreparedStatement stmt = con.prepareStatement(GET_CITIES_SQL);
        ) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                cities.add(CITY_CONVERTER.convert(rs));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return cities;
    }

    public void addCity(City city) {
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
                PreparedStatement stmt = con.prepareStatement(INSERT_CITY_SQL);
        ) {
            prepareStatementToAddCity(stmt, city).executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteCity(City city) {
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
                PreparedStatement stmt = con.prepareStatement(DELETE_CITY);
        ) {
            stmt.setInt(1, city.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Map<Student, String> getStudentAndTheirCityInfo() {
        List<Student> student = getStudents();
        List<City> cities = getCities();
        return student.stream()
                .collect(Collectors.toMap(Function.identity(),
                                s -> cities
                                        .stream()
                                        .filter(c -> c.getId() == s.getCityId())
                                        .map(City::getDescription)
                                        .collect(Collectors.joining())
                        )
                );
    }

    private PreparedStatement prepareStatementToAddStudent(PreparedStatement preparedStatement, Student student) throws SQLException {
        preparedStatement.setString(1, student.getName());
        preparedStatement.setString(2, student.getLastName());
        preparedStatement.setString(3, student.getGender().toString());
        preparedStatement.setInt(4, student.getAge());
        preparedStatement.setInt(5, student.getCityId());
        preparedStatement.setInt(6, student.getHeight());
        preparedStatement.setInt(7, student.getClassId());
        return preparedStatement;
    }

    private PreparedStatement prepareStatementToAddCity(PreparedStatement preparedStatement, City city) throws SQLException {
        preparedStatement.setString(1, city.getName());
        preparedStatement.setString(2, city.getDescription());
        preparedStatement.setInt(3, city.getCountryId());
        return preparedStatement;
    }
}


package com.teachmeskills.lesson20;

import com.teachmeskills.lesson20.converters.CityResultSetConverter;
import com.teachmeskills.lesson20.converters.StudentResultSetConverter;
import com.teachmeskills.lesson20.entities.City;
import com.teachmeskills.lesson20.entities.Gender;
import com.teachmeskills.lesson20.entities.Student;
import com.teachmeskills.lesson20.exceptions.IdNotExistException;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    private static final String getStudentsSQL = "SELECT * FROM school.student";
    private static final String getCitiesSQL = "SELECT * FROM school.city";
    private static final String insertStudentSQL = "INSERT INTO `school`.`student` (`name`, `last_name`, `gender`, " +
            "`age`, `city_id`, `height`, `class_id`) VALUES (?, ?, ?, ?, ?, ?, ?);";
    public static final String insertCitySQL = "INSERT INTO `school`.`city`(`name`, `description`, `country_id`) " +
            "VALUES (?, ?, ?);";

    private static final String deleteCity = "DELETE FROM `school`.`city` where id = ?";
    private static final String deleteStudent = "DELETE FROM `school`.`student` where id = ?";
    private static final String getStudentAndTheirCityInfoSQL =
            "SELECT s.*, c.description FROM school.student s JOIN city c ON s.city_id = c.id";
    private static final StudentResultSetConverter studentConverter = new StudentResultSetConverter();
    private static final CityResultSetConverter cityConverter = new CityResultSetConverter();

    public static void main(String[] args) throws IdNotExistException {
        Test test = new Test();
//        City city = new City();
//        city.setName("Mink");
//        city.setCountryId(1);
//        city.setDescription("Capital of Belarus");
//        test.addCity(city);
        //  test.getStudents();
        //   test.getListOfTableIds("country");
//
//        Student student = new Student();
//        student.setName("Liza");
//        student.setLastName("Vredina");
//        student.setGender(Gender.male);
//        student.setAge(23);
//        student.setHeight(170);
//        student.setClassId(2);
//        student.setCityId(4);
//        student.setId(20);
        // test.addStudent(student);
        //test.deleteStudent(student);
    //    test.getCities().forEach(System.out::println);
        test.getStudentAndTheirCityInfo();
    }

    public void addStudent(Student student) {
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
                PreparedStatement stmt = con.prepareStatement(insertStudentSQL);
        ) {
            stmt.setString(1, student.getName());
            stmt.setString(2, student.getLastName());
            stmt.setString(3, student.getGender().toString());
            stmt.setInt(4, student.getAge());
            stmt.setInt(5, student.getCityId());
            stmt.setInt(6, student.getHeight());
            stmt.setInt(7, student.getClassId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
                PreparedStatement stmt = con.prepareStatement(getStudentsSQL);
        ) {
            ResultSet rs = stmt.executeQuery(getStudentsSQL);
            while (rs.next()) {
                students.add(studentConverter.convert(rs));
            }
            students.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e);
        }
        return students;
    }


    public void deleteStudent(Student student) {
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
                PreparedStatement stmt = con.prepareStatement(deleteStudent);
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
                PreparedStatement stmt = con.prepareStatement(getCitiesSQL);
        ) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                cities.add(cityConverter.convert(rs));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return cities;
    }

    public void addCity(City city) {
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
                PreparedStatement stmt = con.prepareStatement(insertCitySQL);
        ) {
            stmt.setString(1, city.getName());
            stmt.setString(2, city.getDescription());
            stmt.setInt(3, city.getCountryId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteCity(City city) {
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
                PreparedStatement stmt = con.prepareStatement(deleteCity);
        ) {
            stmt.setInt(1, city.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void getStudentAndTheirCityInfo() {
        List<Student> student = getStudents();
        List<City> cities = getCities();
        Map<Student, String> studentAndCityDescriptionMap = new HashMap<>();
        studentAndCityDescriptionMap = student.stream()
                .collect(Collectors.toMap(Function.identity(),
                        s -> cities
                                .stream()
                                .filter(c -> c.getId() == s.getCityId())
                                .map(City::getDescription)
                        )
                );
        System.out.println();
    }
}


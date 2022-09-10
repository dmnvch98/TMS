package com.teachmeskills.lesson20;

import com.teachmeskills.lesson20.converters.IdsResultSetConverter;
import com.teachmeskills.lesson20.converters.StudentResultSetConverter;
import com.teachmeskills.lesson20.entities.City;
import com.teachmeskills.lesson20.entities.Gender;
import com.teachmeskills.lesson20.entities.Student;
import com.teachmeskills.lesson20.exceptions.IdNotExistException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    private static final String sql = "select * from school.student";
    private static final String insertStudentSQL = "INSERT INTO `school`.`student` (`name`, `last_name`, `gender`, `age`, `height`, `class_id`) " +
            "VALUES (?, ?, ?, ?, ?, ?);";
    public static final String insertCitySQL = "INSERT INTO `school`.`city`(`name`, `description`, `country_id`) " +
            "VALUES (?, ?, ?);";

    private static final String deleteCity = "DELETE FROM `school`.`city` where id = ?";
    private static final StudentResultSetConverter studentConverter = new StudentResultSetConverter();
    private static final IdsResultSetConverter countryConverter = new IdsResultSetConverter();

    public static void main(String[] args) throws IdNotExistException {
//        Test test = new Test();
//        City city = new City();
//        city.setName("Mink");
//        city.setCountryId(1);
//        city.setDescription("Capital of Belarus");
//        test.addCity(city);
      //  test.getStudents();
     //   test.getListOfTableIds("country");
        Student student = new Student();
        student.setName("Egor");
        student.setLastName("Bachilo");
        student.setGender(Gender.male);
        student.setAge(23);
        student.setHeight(170);
        student.setClassId(2);
        student.setCityId(5);
        new Test().addStudent(student);
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
            stmt.setInt(5, student.getHeight());
            stmt.setInt(6, student.getClassId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
                PreparedStatement stmt = con.prepareStatement(sql);
        ) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                students.add(studentConverter.convert(rs));
            }
            con.close();
            stmt.close();
            students.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e);
        }
        return students;
    }

    public List<Integer> getListOfTableIds(String tableName) {
        String getTableIdsSQL = "SELECT id FROM school." + tableName;
        List<Integer> countryIds = new ArrayList<>();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
                PreparedStatement stmt = con.prepareStatement(getTableIdsSQL);
        ) {
            ResultSet rs = stmt.executeQuery(getTableIdsSQL);
            while (rs.next()) {
                countryIds.add(countryConverter.existingCountryId(rs));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        countryIds.forEach(System.out::println);
        return countryIds;
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

    public boolean checkIfIDExistInSpecifiedTable(String tableName, int id) {
        String getTableIdsSQL = "SELECT id FROM school." + tableName + " where id = " + id;
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
                PreparedStatement stmt = con.prepareStatement(getTableIdsSQL);
        ) {
            boolean result =  stmt.execute(getTableIdsSQL);
            return result;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}


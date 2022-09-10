package com.teachmeskills.lesson20.converters;

import com.teachmeskills.lesson20.entities.City;
import com.teachmeskills.lesson20.entities.Student;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CityResultSetConverter {
    public City convert(final ResultSet resultSet) {
        City city = new City();
        try {
            city.setId(resultSet.getInt("id"));
            city.setName(resultSet.getString("name"));
            city.setDescription(resultSet.getString("description"));
            city.setCountryId(resultSet.getInt("country_id"));
        } catch (SQLException e) {
            System.out.println(e);
        }
        return city;
    }
}

package com.teachmeskills.lesson20.converters;

import java.sql.ResultSet;
import java.sql.SQLException;

public class IdsResultSetConverter {
    public Integer existingCountryId(ResultSet resultSet) {
        try {
            return resultSet.getInt("id");
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
}

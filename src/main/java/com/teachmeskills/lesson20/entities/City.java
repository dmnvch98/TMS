package com.teachmeskills.lesson20.entities;

import com.teachmeskills.lesson20.Test;
import com.teachmeskills.lesson20.exceptions.IdNotExistException;

import java.util.List;

public class City {
    private int id;
    private String name;
    private String description;
    private int countryId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) throws IdNotExistException {
        List<Integer> existingCountryIds = new Test().getListOfTableIds("country");
        if (existingCountryIds.contains(countryId)) {
            this.countryId = countryId;
        } else {
            throw new IdNotExistException("There is no such country id in the database");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryId=" + countryId +
                '}';
    }
}

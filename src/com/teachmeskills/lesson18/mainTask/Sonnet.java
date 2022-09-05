package com.teachmeskills.lesson18.mainTask;

import java.util.ArrayList;
import java.util.List;

public class Sonnet {
    private String authorFirstName;
    private String authorLastName;
    private String sonnetTitle;
    private List<String> lines = new ArrayList<>();

    public Sonnet() {
    }

    public Sonnet(String authorFirstName, String authorLastName, String sonetTitle, List<String> lines) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.sonnetTitle = sonetTitle;
        this.lines = lines;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getSonnetTitle() {
        return sonnetTitle;
    }

    public void setSonnetTitle(String sonnetTitle) {
        this.sonnetTitle = sonnetTitle;
    }

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        return "Sonnet{" +
                "authorFirstName='" + authorFirstName + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                ", sonnetTitle='" + sonnetTitle + '\'' +
                ", lines=" + lines +
                '}';
    }
}

package com.teachmeskills.lesson17.additionalTask;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<String> documentNumbers = new ArrayList<>();
    private List<String> emails = new ArrayList<>();
    private List<String> phones = new ArrayList<>();

    public Document(List<String> documentNumbers, List<String> emails, List<String> phones) {
        this.documentNumbers = documentNumbers;
        this.emails = emails;
        this.phones = phones;
    }

    public Document() {
    }

    public List<String> getDocumentNumbers() {
        return documentNumbers;
    }

    public void setDocumentNumbers(List<String> documentNumbers) {
        this.documentNumbers = documentNumbers;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentNumbers=" + documentNumbers +
                ", emails=" + emails +
                ", phones=" + phones +
                '}';
    }
}

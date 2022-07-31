package com.teachmeskills.lesson7.additionalTask.documents;

import java.util.Date;

public class ContractWithEmployee extends Document {
    private Date contractEndDate;
    private String employeeName;

    public ContractWithEmployee(int documentNumber, Date documentDate, Date contractEndDate, String employeeName) {
        super(documentNumber, documentDate);
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }

    public ContractWithEmployee() {
        super();
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "ContractWithEmployee{" +
                "documentNumber=" + this.getDocumentNumber() +
                " documentDate=" + this.getDocumentDate() +
                " contractEndDate=" + contractEndDate +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}

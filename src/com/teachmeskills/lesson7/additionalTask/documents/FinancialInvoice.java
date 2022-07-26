package com.teachmeskills.lesson7.additionalTask.documents;

import java.util.Date;

public class FinancialInvoice extends Document {
    private int finalMonthSum;
    private String departureCode;

    public FinancialInvoice(int documentNumber, Date documentDate, int finalMonthSum, String departureCode) {
        super(documentNumber, documentDate);
        this.finalMonthSum = finalMonthSum;
        this.departureCode = departureCode;
    }

    public FinancialInvoice() {
        super();
    }

    public int getFinalMonthSum() {
        return finalMonthSum;
    }

    public void setFinalMonthSum(int finalMonthSum) {
        this.finalMonthSum = finalMonthSum;
    }

    public String getDepartureCode() {
        return departureCode;
    }

    public void setDepartureCode(String departureCode) {
        this.departureCode = departureCode;
    }

    @Override
    public String toString() {
        return "FinancialInvoice{" +
                "documentNumber=" + this.getDocumentNumber() +
                " documentDate=" + this.getDocumentDate() +
                " finalMonthSum=" + finalMonthSum +
                ", departureCode='" + departureCode + '\'' +
                '}';
    }
}

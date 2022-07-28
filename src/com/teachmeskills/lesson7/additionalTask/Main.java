package com.teachmeskills.lesson7.additionalTask;

import com.teachmeskills.lesson7.additionalTask.documents.ContractWithEmployee;
import com.teachmeskills.lesson7.additionalTask.documents.Document;
import com.teachmeskills.lesson7.additionalTask.documents.FinancialInvoice;
import com.teachmeskills.lesson7.additionalTask.documents.GoodsSupplyContract;

import java.util.Date;

import static com.teachmeskills.lesson7.Utils.print;

public class Main {
    public static void main(String[] args) {
        GoodsSupplyContract goodsSupplyContract = new GoodsSupplyContract(111, new Date(), "Type1", 10);
        GoodsSupplyContract goodsSupplyContract1 = new GoodsSupplyContract();

        ContractWithEmployee contractWithEmployee = new ContractWithEmployee(222, new Date(), new Date(), "Yauhen");
        ContractWithEmployee contractWithEmployee1 = new ContractWithEmployee();

        FinancialInvoice financialInvoice = new FinancialInvoice(333, new Date(), 444, "AA");
        FinancialInvoice financialInvoice1 = new FinancialInvoice();

        Register register = new Register();
        register.saveDocumentInRegister(goodsSupplyContract);
        register.saveDocumentInRegister(goodsSupplyContract1);
        register.saveDocumentInRegister(contractWithEmployee);
        register.saveDocumentInRegister(contractWithEmployee1);
        register.saveDocumentInRegister(financialInvoice);
        register.saveDocumentInRegister(financialInvoice1);

        for (Document document: register.getDocuments()) {
            print(register.getDocumentInfo(document));
        }
    }
}

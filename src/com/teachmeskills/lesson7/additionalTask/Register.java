package com.teachmeskills.lesson7.additionalTask;

import com.teachmeskills.lesson7.additionalTask.documents.Document;

public class Register {
    Document[] documents = new Document[10];
    private int documentsQuantity = 0;

    public void saveDocumentInRegister(Document document) {
        if (documentsQuantity < 10) {
            documents[documentsQuantity] = document;
            documentsQuantity++;
        }
    }

    public String getDocumentInfo(Document document) {
        return document.toString();
    }
}

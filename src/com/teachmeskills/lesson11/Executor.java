package com.teachmeskills.lesson11;

import com.teachmeskills.lesson10.mainTask.Document;
import com.teachmeskills.lesson11.additionalTask.Server;
import com.teachmeskills.lesson11.mainTask.DocumentService;

public class Executor {
    public static void main(String[] args) {
        Document document = new Document("5558-yyy-9865-yyy-4y9u");
        Document document1 = new Document();

        DocumentService.isDocumentNumberContainsAbc(document1);
        DocumentService.isDocumentNumberContainsAbc(document);
        DocumentService.isDocumentNumberStartWithFives(document);
        DocumentService.isDocumentNumberEndsWithValue(document);

        Server.registration("user name", "dsfs", "dsfs");
    }
}

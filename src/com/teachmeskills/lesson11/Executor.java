package com.teachmeskills.lesson11;

import com.teachmeskills.lesson10.mainTask.Document;
import com.teachmeskills.lesson11.additionalTask.Server;
import com.teachmeskills.lesson11.mainTask.DocumentService;

import static com.teachmeskills.Utils.print;

public class Executor {
    public static void main(String[] args) {
        Document document = new Document("5558-yyy-9865-yyy-4y9u");
        print(DocumentService.isDocumentNumberContainsAbc(document));
        print(DocumentService.isDocumentNumberStartWithFives(document));
        print(DocumentService.isDocumentNumberEndsWithValue(document));

        print(Server.registration("user name", "dsfs", "dsfs"));
    }
}

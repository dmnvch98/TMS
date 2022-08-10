package com.teachmeskills.lesson11;

import com.teachmeskills.lesson10.mainTask.Document;
import com.teachmeskills.lesson11.additionalTask.Server;
import com.teachmeskills.lesson11.additionalTask.WrongLoginException;
import com.teachmeskills.lesson11.mainTask.DocumentExceptionService;
import static com.teachmeskills.Utils.print;

public class Executor {
    public static void main(String[] args) {
//        Document document = new Document("5558-yyy-9865-yyy-4y9y");
//        DocumentExceptionService documentExceptionService = new DocumentExceptionService();
//        documentExceptionService.isDocumentNumberContainsAbc(document);
//        documentExceptionService.isDocumentNumberStartWithFives(document);
//        documentExceptionService.isDocumentNumberEndsWithValue(document);

       print(Server.registration("dsfs", "dsfs" , "dsfs"));
     //   System.out.println("aasdad".matches(".*[0-9].*"));
    }
}

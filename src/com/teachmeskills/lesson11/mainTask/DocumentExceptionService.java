package com.teachmeskills.lesson11.mainTask;

import com.teachmeskills.lesson10.mainTask.Document;
import static com.teachmeskills.Utils.print;

public class DocumentExceptionService {
    public void isDocumentNumberContainsAbc(Document document) {
        try {
            print(DocumentService.isDocumentNumberContainsAbc(document));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    public void isDocumentNumberStartWithFives(Document document) {
        try {
            print(DocumentService.isDocumentNumberStartWithFives(document));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    public void isDocumentNumberEndsWithValue(Document document) {
        try {
            print(DocumentService.isDocumentNumberEndsWithValue(document));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}

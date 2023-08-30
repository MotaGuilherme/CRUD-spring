package com.nelioalves.cursomc.resources.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

    private List<FieldMessage> list = new ArrayList<>();

    public ValidationError(Long timeStamp, Integer status, String error, String message, String path) {
        super(timeStamp, status, error, message, path);
    }

    public List<FieldMessage> getErros() {
        return list;
    }

    public void addError(String fieldName, String message) {
        list.add(new FieldMessage(fieldName, message));
    }
}

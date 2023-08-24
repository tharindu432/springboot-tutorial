package com.studentManagementSystem.demo2.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResouceNotFoundException extends RuntimeException {

    private  String resourceName;
    private String fieldName;
    private Object FieldValue;

    public ResouceNotFoundException(String resourceName,String fieldName,Object fieldValue){
        super(String.format("%s not found with %s : '%s'",resourceName,fieldName,fieldValue));
        this.resourceName=resourceName;
        this.fieldName=fieldName;
        this.FieldValue=fieldValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Object getFieldValue() {
        return FieldValue;
    }

    public void setFieldValue(Object fieldValue) {
        FieldValue = fieldValue;
    }
}

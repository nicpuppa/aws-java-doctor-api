package com.plansoft.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

@DynamoDBTable(tableName = "doctors_table")
public class Doctor {

    private String id;
    private String name;
    private String surname;

    @DynamoDBHashKey(attributeName = "id")
    @DynamoDBAutoGeneratedKey
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @DynamoDBRangeKey(attributeName = "name")
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @DynamoDBAttribute(attributeName = "surname")
    public String getSurname() {
        return this.surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString() {
        return String.format("Doctor [id=%s, name=%s, surname=$%s]", this.id, this.name, this.surname);
    }

}

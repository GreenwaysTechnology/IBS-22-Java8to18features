package com.ibs.javafeatures.records;

//default constructor
public record Person(int id, String firstName, String lastName) {
    //extra constructors
    public Person() {
        this(0, "firstName", "lastName");
    }

    public String fullName() {
        return this.firstName + this.lastName;
    }
    public static String info() {
        return "Info";
    }
}


package com.ibs.javafeatures.records;


public class RecordMain {
    public static void main(String[] args) {
        Person person = new Person(1, "Subramanian", "Murugan");
        System.out.println(person.id() + " " + person.firstName() + " " + person.lastName());
        System.out.println(person.id() + " " + person.fullName());
        System.out.println(Person.info());
        System.out.println(person.toString());

        Person person1 = new Person();
        System.out.println(person1.id() + " " + person1.firstName() + " " + person1.lastName());
    }
}

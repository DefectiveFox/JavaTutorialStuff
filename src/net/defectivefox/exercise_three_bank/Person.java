package net.defectivefox.exercise_three_bank;

public class Person {

    public String firstName;
    public String middleName;
    public String lastName;
    public int age;
    public String securityNumber;

    public Person(String firstName, String middleName, String lastName, int age, String socialNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.securityNumber = socialNumber;
    }
}

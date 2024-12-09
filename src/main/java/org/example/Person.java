package org.example;

public class Person {

    private int id;

    private  String name;

    private  String gender;

    private Division division;

    private int salary;

    private String birthDate;

    public Person(int id, String name, String gender, Division division, int salary, String birthDate){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.division = division;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" + "ID=" + id + ", name=" + name +
                ", gender=" + gender + ", division=" + division +
                ", salary=" + salary + ", birthDate=" + birthDate + "}";
    }

}

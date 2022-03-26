package com.any.homeworkTwoFiveLists;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private int id;
    private static int counter;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        this.id = counter++;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }

    @Override
    public String toString() {
        return id + " " + firstName + " " + lastName;
    }


}

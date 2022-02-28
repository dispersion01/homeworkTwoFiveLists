package com.any.homeworkTwoFiveLists;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {


    Employee[] arrEmployee = new Employee[10];


    public Employee findEmployee(String firstName, String lastName) { // поиск для использования в методах ниже
        Employee findElement = new Employee(firstName, lastName);
        for (int i = 0; i < arrEmployee.length; i++) {
            if (arrEmployee[i] != null && arrEmployee[i].equals(findElement) )     {
                throw new ExceptionsEmployee();
            }
        }
        return findElement;
    }

    public Employee addEmployee(String firstName, String lastName) {
        Employee newElement = new Employee(firstName, lastName);
        for (int i = 0; i < arrEmployee.length; i++) {
            if (arrEmployee[i] != null) {
                throw new ExceptionsEmployee();
            }
            arrEmployee[i] = newElement;

        }
        return newElement;
    }

    public Employee removeEmployee(String firstName, String lastName) {
        Employee removeElement = new Employee(firstName, lastName);
        removeElement = findEmployee(firstName, lastName);
        for (int i = 0; i < arrEmployee.length; i++) {
            if ((findEmployee(firstName, lastName).getFirstName() == arrEmployee[i].getFirstName()) &&
                    (findEmployee(firstName, lastName).getLastName() == arrEmployee[i].getLastName())
            ) {
                arrEmployee[i] = null;
                for (int j = 0; j < arrEmployee.length; j--) {
                    arrEmployee[j] = arrEmployee[j - 1];
                }
            } else {
                throw new ExceptionsEmployee();
            }


        }
        return removeElement;
    }



}

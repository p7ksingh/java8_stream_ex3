package com.infy.java8streamapiex.streamapiex;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee {
    private int id;
    private String name;
    private int salary;
}

public class MathFunJava8 {
    public static void applyMathFun(List<Employee> empList) {
        List<Integer> salaries = empList.stream().map(dt -> dt.getSalary()).collect(Collectors.toList());
        IntSummaryStatistics summary = salaries.stream().mapToInt(dt -> dt).summaryStatistics();
        // max salary
        System.out.println(summary.getMax());
        // min salary
        System.out.println(summary.getMin());
        // average salaries
        System.out.println(summary.getAverage());
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();

        Employee employee1 = new Employee(101, "bharathi", 100000);

        Employee employee2 = new Employee(102, "bharathi", 900000);
        Employee employee6 = new Employee(106, "Pankaj", 1200000);
        Employee employee3 = new Employee(103, "usha", 300000);
        Employee employee4 = new Employee(104, "alex", 400000);
        Employee employee5 = new Employee(105, "obuli", 500000);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        // System.out.println(employees);
        applyMathFun(employees);
    }
}

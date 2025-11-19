package org.example.javasteams;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class Employee {
    final String name;
    final String dept;
    final String role;
    final int age;
    final int salary;

    Employee(String name, String dept, String role, int age, int salary) {
        this.name = name;
        this.dept = dept;
        this.role = role;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getRole() {
        return role;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return String.format("%s(%s,%s,%d,%d)", name, dept, role, age, salary);
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Engineering", "Developer", 30, 120000),
                new Employee("Bob",   "Engineering", "Developer", 28, 110000),
                new Employee("Carol", "Engineering", "Manager",  40, 160000),
                new Employee("Dave",  "HR",          "Recruiter",35,  70000),
                new Employee("Eve",   "HR",          "Manager",  45,  90000),
                new Employee("Frank", "Sales",       "Rep",     29,  80000),
                new Employee("Grace", "Sales",       "Manager", 38, 120000)
        );

        //group employees by department.
        //Group employees by department.
      //  Map<String, List<Employee>> byDeptMap = employees.stream().colle

        //get employee name with highest salary.
      //  String empName = employees.stream().filter(Employee e -> e)

        //There is a list of Employee objects, write a stream program to find all the employees whose age > 3o
        //and salary is > 30,000 and sort them by age.
        var vetEmpList = employees.stream().filter(e -> e.getAge() > 30).toList();
        System.out.println("employees more than 30year:"+vetEmpList);

        //get employee name with highest salary.
        String empwithMaxSal = employees.stream().max(Comparator.comparing(Employee::getSalary)).get().toString();
        System.out.println(empwithMaxSal);

        String empWithMinSal = employees.stream().min(Comparator.comparing(Employee::getSalary)).get().toString();
        System.out.println(empWithMinSal);

        var byDeptMap = employees.stream().collect(Collectors.groupingBy(Employee::getDept));

        System.out.println("byDeptMap:"+byDeptMap);

        //Group employees by department but only keep employee names as List<String>.
        var empNameByDep = employees.stream().collect(Collectors.groupingBy(Employee::getDept, mapping(e -> e.getName(), toList())));
        System.out.println("empNameByDep:"+empNameByDep);

        //Count employees per department and compute average salary per department.
        var computeSal = employees.stream().collect(Collectors.averagingInt(Employee::getSalary));
        System.out.println("computeSal:"+computeSal);
        var countEmp = employees.stream().collect(Collectors.counting());
        System.out.println("countEmp:"+countEmp);

        var countByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
        System.out.println("countByDept:"+countByDept);

        var avgSalaryByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.averagingInt(Employee::getSalary)));
        System.out.println("avgSalaryByDept:"+avgSalaryByDept);

        var totalSalaryByDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.summingInt(Employee::getSalary)));
        System.out.println("totalSalaryByDepartment:"+totalSalaryByDepartment);

        var groupByDepartmentAndByRole = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.groupingBy(Employee::getRole)));
        System.out.println("groupByDepartmentAndByRole:"+groupByDepartmentAndByRole);


    }
}

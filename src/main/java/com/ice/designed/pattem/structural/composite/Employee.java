package com.ice.designed.pattem.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String deptNo;

    private Long salary;

    private List<Employee> employeeList;

    public Employee(String name, String deptNo, Long salary) {
        this.name = name;
        this.deptNo = deptNo;
        this.salary = salary;
        this.employeeList = new ArrayList<>();
    }

    public void add(Employee employee) {
        employeeList.add(employee);
    }

    public void remove(Employee employee) {
        employee.remove(employee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "部门编号 : " + deptNo + " ,姓名 : " + name + " ,薪资 : " + salary;
    }
}

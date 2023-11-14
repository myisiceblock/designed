package com.ice.designed.pattem.structural.composite;

public class Test {
    public static void main(String[] args) {
        Employee ceo = new Employee("张三", "1", 20000L);

        Employee management = new Employee("李四", "2", 10000L);

        Employee seller1 = new Employee("王五", "3", 5000L);
        Employee seller2 = new Employee("田七", "3", 5000L);

        Employee store = new Employee("赵六", "4", 3000L);

        ceo.add(management);

        management.add(seller1);
        management.add(seller2);
        management.add(store);

        System.out.println(ceo);
        for (Employee employee : ceo.getEmployeeList()) {
            System.out.println("部门编号 : " + employee.getDeptNo() + " ,姓名 : " + employee.getName() + " ,薪资 : " + employee.getSalary());
            for (Employee employee1 : employee.getEmployeeList()) {
                System.out.println("部门编号 : " + employee1.getDeptNo() + " ,姓名 : " + employee1.getName() + " ,薪资 : " + employee1.getSalary());
            }
        }
    }
}

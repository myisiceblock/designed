package com.ice.designed.pattem.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ManagementFactory {

    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);

        if(manager == null) {
            manager = new Manager(department);
            System.out.println("创建部门经理：" + department);
            String noteContent = department + "部门来此汇报工作,内容是...";
            manager.setNoteContent(noteContent);
//            System.out.println(department + "部门汇报工作完成...");
            EMPLOYEE_MAP.put(department, manager);
        }

        return manager;
    }
}

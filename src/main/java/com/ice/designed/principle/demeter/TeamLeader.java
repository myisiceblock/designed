package com.ice.designed.principle.demeter;

public class TeamLeader implements Manager {

    private Programmer programmer;

    public void setProgrammer(Programmer programmer) {
        this.programmer = programmer;
    }

    public void assignTasks() {
        System.out.println("给下属分配任务");
        if (programmer instanceof JavaProgrammer) {
            ((JavaProgrammer) programmer).work();
        } else if (programmer instanceof PythonProgrammer) {
            ((PythonProgrammer) programmer).work();
        }
    }
}

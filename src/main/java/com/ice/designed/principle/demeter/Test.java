package com.ice.designed.principle.demeter;


public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        JavaProgrammer javaProgrammer = new JavaProgrammer();
        PythonProgrammer pythonProgrammer = new PythonProgrammer();

        //老板通知项目经理开会
        boss.meet(teamLeader);

        teamLeader.setProgrammer(javaProgrammer);

        //项目经理开完会进行任务分配
        teamLeader.assignTasks();

        teamLeader.setProgrammer(pythonProgrammer);

        teamLeader.assignTasks();
    }
}

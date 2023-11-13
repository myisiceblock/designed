package com.ice.designed.principle.demeter;

public class Boss implements Manager {
    public void meet(TeamLeader teamLeader) {
        System.out.println("老板开会，分布任务");
        teamLeader.assignTasks();
    }
}

package com.optum;

import java.util.Map;

public class Workforce {

    private Map<String, Employee> taskforce;

    public void setTaskforce(Map<String, Employee> taskforce) {
        this.taskforce = taskforce;
    }

    public void addEmployee(String id, Employee e){
        taskforce.put(id, e);
        System.out.println("added");
    }

    public void removeEmployee(String id){
        taskforce.remove(id);
        System.out.println("removed");
    }

    public void updateEmployee(String id, Employee e){
        taskforce.remove(id);
        taskforce.put(id,e);
        System.out.println("updated");
    }

    public void display(){
        for(String id: taskforce.keySet()){
            System.out.print("ID: " + id + ", ");
            Employee e = taskforce.get(id);
            System.out.println(e.toString());
        }
    }

}

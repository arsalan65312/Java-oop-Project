package Domain_Classes;

import java.util.ArrayList;

public class Project{
    protected int projectId;
    protected String name;
    protected String description;
    protected String startDate;
    protected String endDate;

    private ArrayList<Task> tasks;

    private Client client;
    private Manager manager;

    public Project(int projectId, String name, String description, String startDate, String endDate){
        this.projectId=projectId;
        this.name=name;
        this.description=description;
        this.startDate=startDate;
        this.endDate=endDate;
    }

    public Project() {

    }

    void addTask(Task task){
        
    }
    void setProjectProgress(){

    }
    void generateReport(){

    }
}
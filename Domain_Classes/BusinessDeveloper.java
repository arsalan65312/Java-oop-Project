package Domain_Classes;

import java.util.ArrayList;

public class BusinessDeveloper {
    protected int bdId;
    protected String name;
    protected String phoneNumber;
    private ArrayList<Client> clients;

    BusinessDeveloper(int bdId, String name, String phoneNumber){
        this.bdId=bdId;
        this.name=name;
        this.phoneNumber=phoneNumber;
    }
    BusinessDeveloper(){

    }

    void negotiateProject(Client client, Project projectDetails){

    }
    void assignProjectToManager(Project project, Manager manager){

    }
    void getClientList(){

    }
}

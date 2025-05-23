package Domain_Classes;

import java.util.ArrayList;

public class Client {

    protected int clientId;
    protected String name;
    protected String phoneNumber;
    protected String address;

    private ArrayList<Project> projects;


    Client(int clientId, String name, String phoneNumber, String address) {
        this.clientId = clientId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    Client() {

    }



    void requestProjectDetails(String details) {

    }

    void viewProjectStatus() {

    }

    void addFeedback(String comment) {

    }

}

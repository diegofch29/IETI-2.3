package eci.ieti.data.model;

import org.springframework.data.annotation.Id;

public class Task {

   @Id 
    private String id;

    private String description;

    private String priority;

    private String dueDate;

    private String responsible;

    private String status;


    public Task() {
    }


    public Task(String id, String description, String priority, String dueDate, String responsible, String status) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
        this.responsible = responsible;
        this.status = status;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return this.priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getResponsible() {
        return this.responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", description='" + getDescription() + "'" +
            ", priority='" + getPriority() + "'" +
            ", dueDate='" + getDueDate() + "'" +
            ", responsible='" + getResponsible() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }

    
}

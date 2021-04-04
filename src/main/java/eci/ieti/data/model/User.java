package eci.ieti.data.model;

import org.springframework.data.annotation.Id;

public class User
{
   @Id 
    private String  id;

    private String email;

    private String name;


    public User() {
    }

    public User(String id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", email='" + getEmail() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
    
}

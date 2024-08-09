package com.curso.springboot.webapp.springboot_web.models.DTO;



public class UserDTO {

    private String title;
    private String name;
    private String lastname;

    public UserDTO(String title, String name, String lastname) {
        this.title = title;
        this.name = name;
        this.lastname = lastname;
    }


    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    
    
}

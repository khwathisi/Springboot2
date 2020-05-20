package com.springweb.Entity;
import java.util.Map;
import java.util.UUID;

public class User {
    private static Map<Integer, User> user;
    private UUID Id;
    private String name;
    private String surname;

    public User(
            UUID id,
            String name,
            String surname) {
        this.Id = UUID.randomUUID();
        this.name = name;
        this.surname = surname;
    }


    //Getters
    public static Map<Integer, User> getUser() throws InterruptedException {
        System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
        Thread.sleep(1000*5);
        return user;
    }
    public UUID getId() { return Id; }
    public String getName() { return name; }
    public String getSurname() { return surname; }

    //Setters
    public void setId(UUID id) { Id = id; }
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }


}



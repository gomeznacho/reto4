package com.jonez;

public class Usuario {
    public String name;
    public int age;
    public int id;
    public int priority;

    public void logIn(){
        System.out.println("el usuario " + name +" ha entrado");
    }
    public void logOut(){System.out.println("el usuario " + name + " ha salido");}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

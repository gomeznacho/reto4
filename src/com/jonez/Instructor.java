package com.jonez;

import java.util.ArrayList;

public class Instructor extends Usuario {
    public int fame;
    public String degree;

    public Instructor(String name, int age, int id, int priority,int fame, String degree) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.priority = 2;
        this.fame = fame;
        this.degree = degree;
    }

    public void examen (ArrayList<Estudiante> clase, int result) {
        for (Estudiante e : clase) {
            System.out.println("nota media de " + e.name + ": " + e.average + " antes del examen");
            if (result >= 5) {
                System.out.println(e.name + " ha aprobado");
                e.average++;
                System.out.println("nota media de " + e.name + " despues del examen: " + e.average);
            } else {
                System.out.println(e.name + " ha suspendido");
                e.average--;
                System.out.println("nota media de " + e.name + "despues del examen: " + e.average);
                 }
            }
        }

    public boolean divertido(int chiste){
        return chiste >= 5;
    }

    public int fameIncDec(boolean fun){
        if(fun)
            return fame++;
        else return fame--;

    }

}

package com.jonez;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Estudiante extends Usuario {

    public double average;
    public boolean punish;
    public ArrayList<Curso> cursos;
    public int notaExamen = 5;

    public Estudiante(String name, int age, int id, int priority, double average, boolean punish, ArrayList<Curso> cursos) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.priority = 3;
        this.average = average;
        this.punish = punish;
        this.cursos = cursos;
    }

    public void copiar(){
        average++;
    }

    public void estudiar(){
        notaExamen++;
    }

    public void fallar(){
        notaExamen--;
    }

}

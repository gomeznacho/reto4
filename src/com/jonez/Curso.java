package com.jonez;

import java.util.ArrayList;

public class Curso {

    public String cName;

    public  ArrayList<Estudiante> estudiantes;
    public Instructor profesor;



    public Curso() {
    }
    public Curso(String cName, ArrayList<Estudiante> estudiantes, Instructor profesor) {
        this.cName=cName;
        this.estudiantes = estudiantes;
        this.profesor = profesor;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void asignarCursos(Estudiante e, Curso c){

    }

}

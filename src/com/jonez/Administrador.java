package com.jonez;

import java.util.ArrayList;

public class Administrador extends Usuario {
    public boolean admin;
    public int career;

    public Administrador(String name, int age, int id, int priority,boolean admin, int career) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.priority = 1;
        this.admin = admin;
        this.career = career;
    }

    public void formarClases (ArrayList<Estudiante> clase1, ArrayList<Estudiante> clase2,
                              ArrayList<Estudiante> clase3, ArrayList<Estudiante> promocion){
        for(Estudiante e: promocion){
            if(e.age<=11)
                clase1.add(e);
            else clase2.add(e);
            if(e.average>8)
                clase3.add(e);
        }
    }

    public void formarCursos(ArrayList<Curso> c, ArrayList<Estudiante> promo) {
        for (Curso cu : c ) {
            for (Estudiante e : promo) {
                if (cu.estudiantes.contains(e)) {
                    e.cursos.add(cu);
                    System.out.println("alumno: " + e.getName() + " va a la clase: " + cu.getcName());
                }
            }
        }
    }

    public ArrayList<Estudiante> aceptado(ArrayList<Estudiante> promocion){
        ArrayList<Estudiante> prom = new ArrayList<>();
        for (Estudiante e : promocion) {
            if (e.average<2.0) {
                System.out.println("no tienes suficiente nota media, " + e.name);
            } else {
                System.out.println("bienvenido " + e.name);
                prom.add(e);
            }
        }
        return prom;
    }
}

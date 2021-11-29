package com.jonez;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Administrador admin = new Administrador("El Jefe", 200, 000001, 1, true, 68);

        Estudiante est1 = new Estudiante("pepe", 10, 555444, 3, 8.5, false, new ArrayList<Curso>());
        Estudiante est2 = new Estudiante("papa", 11, 555333, 3, 7.0, true, new ArrayList<Curso>());
        Estudiante est3 = new Estudiante("pipi", 12, 545393, 3, 6.0, false, new ArrayList<Curso>());
        Estudiante est4 = new Estudiante("pupu", 13, 345637, 3, 9.5, true, new ArrayList<Curso>());
        Estudiante est5 = new Estudiante("popo", 13, 345637, 3, 1.8, true, new ArrayList<Curso>());

        ArrayList<Estudiante> inscritos = new ArrayList<>();

        inscritos.add(est1);
        inscritos.add(est2);
        inscritos.add(est3);
        inscritos.add(est4);
        inscritos.add(est5);

        System.out.println("se han inscrito: " + inscritos.size() + " alumnxs");

        ArrayList<Estudiante> promoción = admin.aceptado(inscritos);
        System.out.println("se han aceptado: " + promoción.size() + " alumnxs");

        Instructor inst1 = new Instructor("jof", 45, 333444, 2, 5, "English");
        Instructor inst2 = new Instructor("jef", 35, 343544, 2, 3, "Math");

        ArrayList<Estudiante> clase1 = new ArrayList<>();

        ArrayList<Estudiante> clase2 = new ArrayList<>();

        ArrayList<Estudiante> clase3 = new ArrayList<>();
        admin.formarClases(clase1, clase2, clase3, promoción);
        System.out.println("la clase 2 tiene: " + clase2.size()+ " alumnxs");

        Curso curso1 = new Curso( "primero A", clase1, inst1);
        Curso curso2 = new Curso("primero B",clase2, inst2);
        Curso curso3 = new Curso("especial", clase3, inst2);

        ArrayList<Curso> courses = new ArrayList<>();
        courses.add(curso1);
        courses.add(curso2);
        courses.add(curso3);

        admin.formarCursos(courses, promoción);

        est1.logIn();
        est2.logIn();
        est3.logIn();
        est4.logIn();

        inst1.examen(clase1, 5);
        inst2.examen(clase2, 6);

        est1.logOut();
        est2.logOut();


    }
}

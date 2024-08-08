/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz4semana12;

import javax.swing.JOptionPane;

/**
 *
 * @author TChaves
 */

public class Estudiantes {

    public String nombre;
    public String curso;
    public String profesor;
    public double calificacion;
public double contador;

    public Estudiantes(String nombre, String curso, String profesor, double calificacion) {
        this.nombre = nombre;
        this.curso = curso;
        this.profesor = profesor;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
        }
public void infoEstudiantes() {
        int x;
        double notamayor;
        double notamenor;
        double promedio;
        double mayorpromedio;
        double menorpromedio;
        double sum=0;
        double contador=0;
        for (x = 0; x <= 10; x++) {
            int estudiante[] = new int[10];
            nombre = JOptionPane.showInputDialog("Digite el nombre del estudiante");
            curso = JOptionPane.showInputDialog("Digite el nombre del curso");
            profesor = JOptionPane.showInputDialog("Digite el nombre del profesor");
            calificacion = Integer.parseInt(JOptionPane.showInputDialog("Digite la calificacion del estudiante"));
            
            sum += calificacion;
            if (calificacion >= 70) {
                contador += 1;
            }
            notamayor = calificacion;
            if (calificacion > notamayor) {
                notamayor = calificacion;
            }
            promedio = sum / 10;
            System.out.println("El promedio es: " + promedio);
            System.out.println("La cantidad de alumnos aprobados es: " + contador);
            System.out.println("La nota mayor es: " + notamayor);

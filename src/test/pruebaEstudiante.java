
package test;

import dominio.Estudiante;
import java.util.Scanner;


public class pruebaEstudiante {
    //static Scanner num = new Scanner (System.in);
    static Scanner datos = new Scanner (System.in);
    public static void main (String[] args){
        Estudiante [] Estudiantes;
        int num; 
        System.out.println("Poravor ingrese el numero de estudiantes: ");
        num = datos.nextInt();
        Estudiantes = new Estudiante[num];
        llenarDatos(Estudiantes);
        
    }
    
    public static void llenarDatos(Estudiante est[]){
        String nombre;
        String genero;
        double nota;
        for (int i=0;i<est.length;i++){
             System.out.println("Nombre: ");
             nombre = datos.nextLine();
             System.out.println("Genero: ");
             genero = datos.nextLine();
             System.out.println("Nota: ");
             nota = datos.nextDouble();
        }  
    }
  
}
    


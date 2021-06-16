
package dominio;


public class Estudiante {
    private String nombre;
    private char genero;
    private double nota;

    public Estudiante(String nombre, char genero, double nota) {
        this.nombre = nombre;
        this.genero = genero;
        this.nota = nota;
    }

    public String getNom() {
        return nombre;
    }

    public char getGener() {
        return genero;
    }

    public double getNota() {
        return nota;
    }
    
    @Override
    public String toString(){
        return this.nombre+""+this.genero+""+this.nota+"";
}
    }



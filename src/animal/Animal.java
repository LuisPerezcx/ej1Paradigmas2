package animal;

import interfaces.Caracteristicas;

public class Animal implements Caracteristicas {
    private String nombre;
    private String genero;
    private String nombreCientifico;
    private String color;
    private double tamano;
    private String habitat;

    public Animal(String nombre, String genero, String nombreCientifico, String color, double tamano, String habitat) {
        this.nombre = nombre;
        this.genero = genero;
        this.nombreCientifico = nombreCientifico;
        this.color = color;
        this.tamano = tamano;
        this.habitat = habitat;
    }

    @Override
    public void comer() {
        System.out.println("comiendo");
    }

    @Override
    public void movimiento() {
        System.out.println("moviendose");
    }

    @Override
    public void comunicacion() {
        System.out.println("comunicandose");
    }

    @Override
    public String toString() {
        return "\n----------------------------\n"+"Animal\n" + "Nombre: " + nombre + "\ngenero: " + genero +
                "\nNombre Cientifico: " + nombreCientifico + "\ncolor: " + color +
                "\nTamaño: " + tamano + " cm"+ "\nhabitat: " +habitat;
    }
}

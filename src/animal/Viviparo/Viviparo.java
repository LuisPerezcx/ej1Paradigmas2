package animal.Viviparo;

import animal.Animal;

public class Viviparo extends Animal {
    private int periodoGestion;
    private String tipoReproduccion;

    public Viviparo(String nombre, String genero, String nombreCientifico, String color, double tamano, String habitat,int periodoGestion, String tipoReproduccion) {
        super(nombre,genero,nombreCientifico,color,tamano,habitat);
        periodoGestion = periodoGestion;
        this.tipoReproduccion = tipoReproduccion;
    }

    @Override
    public void comer() {
        System.out.println("comiendo pero en viviparo");
    }
    @Override
    public void movimiento(){
        System.out.println("Moviendose pero en viviparo");
    }
    @Override
    public void comunicacion(){
        System.out.println("comunicandose en viviparo");
    }
    @Override
    public String toString(){
        return super.toString() + "\nPerido de gestion: " + periodoGestion + " semanas" +
                "\ntipo de reproduccion: " + tipoReproduccion + "\n";
    }
}


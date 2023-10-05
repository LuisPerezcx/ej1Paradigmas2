package animal.Oviparo;


import animal.Animal;

public class Oviparo extends Animal {
    private int cantidadHuevos;
    private int tiempoEncubacion;
    private double temperaturaHuevo;
    private String colorHuevo;

    public Oviparo(String nombre, String genero, String nombreCientifico, String color, double tamano, String habitat,int cantidadHuevos, int tiempoEncubacion, double temperaturaHuevo, String colorHuevo) {
        super(nombre,genero,nombreCientifico,color,tamano,habitat);
        this.cantidadHuevos = cantidadHuevos;
        this.tiempoEncubacion = tiempoEncubacion;
        this.temperaturaHuevo = temperaturaHuevo;
        this.colorHuevo = colorHuevo;
    }
    @Override
    public void comer() {
        System.out.println("comiendo pero en oviparo");
    }
    @Override
    public void movimiento(){
        System.out.println("Moviendose pero en oviparo");
    }
    @Override
    public void comunicacion(){
        System.out.println("comunicandose en oviparo");
    }

    @Override
    public String toString() {
        return  super.toString() + "\nCantidad de huevos: " + cantidadHuevos + "\ntiempo de encubacion: " + tiempoEncubacion +
                " semanas" + "\ntemperatura del huevo: " + temperaturaHuevo +" grados" + "\ncolor del huevo: " + colorHuevo +
                "\n";
    }
}

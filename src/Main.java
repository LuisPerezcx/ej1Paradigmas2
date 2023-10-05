import animal.Animal;
import operaciones.CrearAnimales;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CrearAnimales crearAnimales = new CrearAnimales();
        ArrayList<Animal> animalArrayList = new ArrayList<>();

        crearAnimales.crear(animalArrayList);
        System.out.println(animalArrayList);
    }
}
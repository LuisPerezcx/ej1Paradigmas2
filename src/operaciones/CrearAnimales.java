package operaciones;

import animal.Animal;
import animal.Oviparo.Oviparo;
import animal.Viviparo.Viviparo;

import java.util.ArrayList;

public class CrearAnimales {
    public void crear(ArrayList<Animal> animales){

        //oviparos

        animales.add(new Oviparo("pollo","macho","pollinus","Amarillo",6.00,
                "granja",5,2,35.00,"blanco"));
        animales.add(new Oviparo("tortuga", "hembra", "tortugus", "verde", 10.00,
                "playa", 4, 30, 50.00, "verde"));

        animales.add(new Oviparo("serpiente", "macho", "serpentis", "marrón", 4.50,
                "selva", 6, 15, 30.00, "marrón"));

        animales.add(new Oviparo("cocodrilo", "macho", "crocodylus", "verde oscuro", 150.00,
                "río", 4, 45, 500.00, "verde"));

        animales.add(new Oviparo("tiburón", "hembra", "sharkus", "gris", 300.00,
                "océano", 53, 60, 800.00, "gris"));

        animales.add(new Oviparo("pingüino", "macho", "pinguinus", "negro y blanco", 5.00,
                "Antártida", 2, 5, 40.00, "negro y blanco"));

        //viviparos

        animales.add(new Viviparo("perro","hembra","perris","negro",120,
                "casa",4,"placentario"));
        animales.add(new Viviparo("elefante", "hembra", "elephantus", "gris", 6000.00,
                "sabana", 4, "placentario"));

        animales.add(new Viviparo("delfín", "macho", "delphinus", "gris", 150.00,
                "océano", 2, "placentario"));

        animales.add(new Viviparo("león", "macho", "leonis", "amarillo", 200.00,
                "sabana", 4, "placentario"));

        animales.add(new Viviparo("jirafa", "hembra", "giraffa", "amarillo y manchas marrones", 1500.00,
                "sabana", 4, "placentario"));

        animales.add(new Viviparo("ballena", "hembra", "whaleus", "azul", 200000.00,
                "océano", 56, "placentario"));

    }
}

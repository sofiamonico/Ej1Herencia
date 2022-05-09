/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main que realice lo siguiente:
 */
package ej1herencia;

import animal.entidades.Animal;
import animal.entidades.Caballo;
import animal.entidades.Gato;
import animal.entidades.Perro;

public class Ej1Herencia {

    public static void main(String[] args) {
       Animal perro = new Perro("Stich","Canivoro", 2, "Caniche" );
       perro.alimentarse();
       Perro perro1= new Perro("Pepito", "Croquetas", 4, "Rotwailer");
       perro1.alimentarse();
       Animal gato= new Gato("Sancho", "Galletas", 6, "Europeo");
       gato.alimentarse();
       Animal caballo = new Caballo ("Relampago", "Pasto", 9, "Fino");
       caballo.alimentarse();
    }
    
}

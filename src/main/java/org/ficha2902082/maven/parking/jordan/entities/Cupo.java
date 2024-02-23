package org.ficha2902082.maven.parking.jordan.entities;

public class Cupo {

    public char letra; 
    public double largo;
    public double ancho;

   //construtor por defecto
    public Cupo() {
    }

    //contructor con parametros
    public Cupo(char letra, double largo, double ancho) {

        this.letra = letra;
        this.largo = largo;
        this.ancho = ancho;

    }
    

    

}

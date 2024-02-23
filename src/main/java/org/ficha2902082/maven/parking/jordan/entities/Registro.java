package org.ficha2902082.maven.parking.jordan.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {

    // atributos intrinsecos:
    public LocalDate fechaInicio;
    public LocalTime horaInicio;
    public LocalDate fechaFin;
    public LocalTime horaFin;
    public double valor;

    // atributos de relacion
    public carro carro;
    public Cupo cupo;

   // contructor por defecto
    public Registro() {
    }
    
   //contructor parametrizado
    public Registro(LocalDate fechaInicio, LocalTime horaInicio, LocalDate fechaFin, LocalTime horaFin, double valor,
            org.ficha2902082.maven.parking.jordan.entities.carro carro, Cupo cupo) {
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaFin = fechaFin;
        this.horaFin = horaFin;
        this.valor = valor;
        this.carro = carro;
        this.cupo = cupo;
    }

}

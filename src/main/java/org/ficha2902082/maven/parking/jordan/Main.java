package org.ficha2902082.maven.parking.jordan;

import java.util.List;
import org.ficha2902082.maven.parking.jordan.entities.Cliente;
import org.ficha2902082.maven.parking.jordan.entities.Cupo;
import org.ficha2902082.maven.parking.jordan.entities.Registro;
import org.ficha2902082.maven.parking.jordan.entities.TipoDocumento;
import org.ficha2902082.maven.parking.jordan.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.jordan.entities.carro;
import java.util.ArrayList;
import java.time.*;


public class Main {
    public static void main(String[] args) {

      //crear 2 cupos
      //instanciar 2 cupos
     Cupo espacio1 = new Cupo();
     espacio1.ancho = 1.0;
     espacio1.largo = 4.5;
     espacio1.letra = 'A'; 

     Cupo espacio2 = new Cupo('B', 5.0, 2.5);

     //intanciar 2 carros
     carro vehiculo1 = new carro("ABC 123", TipoVehiculo.TAXI);
     carro vehiculo2 = new carro("OJB 567", TipoVehiculo.MOTO);

     //instanciar un cliente
     Cliente conductor = new Cliente("Julian", "Gonzalez",TipoDocumento.CC, 1011201296L, 3003353480L);

     //vincular carro al cliente

     conductor.addCar(vehiculo2);
     conductor.addCar(vehiculo1);
     conductor.addCar("ABs 345", TipoVehiculo.CARRO);

     //declarar una lista de registros

     List <Registro> misRegistros = new ArrayList<>();

     //instanciar 2 registros E/S

     Registro lista1 = new Registro(
       LocalDate.of(2024,Month.FEBRUARY,3),
       LocalTime.of(15, 30, 34),
       LocalDate.of(2024, Month.FEBRUARY, 20),
       LocalTime.of(6, 30, 23),
       50000.00,
       conductor.misCarros.get(0),
       espacio1
     );

     Registro lista2 = new Registro(
        LocalDate.of(2024,Month.JANUARY, 31),
        LocalTime.of(7, 15, 10),
        LocalDate.of(2024, Month.FEBRUARY, 2),
        LocalTime.of(12, 36, 45),
        45000.00,
        conductor.misCarros.get(0),
        espacio2

     );

     //vincular los registros a la lista
     //de registros
     
     misRegistros.add(lista1);

     misRegistros.add(lista2);

     //recorrer la lista de registros

     for(Registro r : misRegistros){

        System.out.println(" placa: " + 
        r.carro.placa + "/" + 
        "Cupo" + 
        r.cupo.letra + "/" +
        "valor:" + 
        r.valor + "/" + 
        "Fecha inicio" +
        r.fechaInicio.toString() + 
        "/" + 
        "Hora inico" +
        r.horaInicio.toString() + 
        "/" + 
        "Fecha fin" + 
        r.fechaFin.toString() +
        "/" +
        "hora fin" +
        r.horaFin.toString() 
        );

     }

    }
    
    
}
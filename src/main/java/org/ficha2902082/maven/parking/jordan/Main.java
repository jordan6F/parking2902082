package org.ficha2902082.maven.parking.jordan;
// importar dependencias
 import org.ficha2902082.maven.parking.jordan.entities.carro;
import org.ficha2902082.maven.parking.jordan.entities.Cliente;
import org.ficha2902082.maven.parking.jordan.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.jordan.entities.TipoDocumento;

public class Main {
    public static void main(String[] args) {
       //crear 2 instancias
       //de la clase carro
       carro carrito1 = new carro();
       carrito1.placa = "ASB 345";
       carrito1.tipoVehiculo = TipoVehiculo.CAMIONETA;

       carro carrito2 = new carro();
       carrito2.placa = "PAZ 987";
       carrito2.tipoVehiculo = TipoVehiculo.CARRO;

       carro carrito3 = new carro();
       carrito3.placa = "PAZ 987";
       carrito3.tipoVehiculo = TipoVehiculo.MOTO;

       carro carrito4 = new carro();
       carrito4.placa = "MIO 456";
       carrito4.tipoVehiculo = TipoVehiculo.CAMION;

       Cliente conductor1 = new Cliente();
       conductor1.nombre = "Brayan";
       conductor1.apellidos = "Jimenez";
       conductor1.tipoDocumento = TipoDocumento.CM;
       conductor1.numeroDocumento = 20304179L;
       conductor1.celular = 3003353480L;

       //añadir carros al cliente
       //invocar,llamar,ejecutar 
       //el metodo addCar

       conductor1.addCar(carrito1);

       conductor1.addCar(carrito2);

       conductor1.addCar("PAZ 987", TipoVehiculo.MOTO);
       

       System.out.println("Cliente: " + conductor1.nombre);
       System.out.println("documento: "  + conductor1.numeroDocumento);
       System.out.println("vehiculo:");
       for ( carro c : conductor1.misCarros ) {
        System.out.println("placa:" + c.placa);
        System.out.println("tipo:" + c.tipoVehiculo);
        System.out.println("__________________");
       }

    

       Cliente conductor2 = new Cliente();
       conductor2.nombre = "sara";
       conductor2.apellidos = "angarita";
       conductor2.tipoDocumento = TipoDocumento.CC;
       conductor1.numeroDocumento = 1011201296L;
       conductor1.celular = 3118020455L;

    }
}
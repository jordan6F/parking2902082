package org.ficha2902082.maven.parking.jordan.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String nombre;
    public String apellidos;
    public TipoDocumento tipoDocumento;
    public Long numeroDocumento;
    public Long celular;

    public List<carro> misCarros = new ArrayList<carro>();

    //metodo 1: añadir carro al cliente
    // definir metodo
    // - modificar acceso
    // - nombre del metodo
    // parametros (Entradas, imputs)
    //  1. Tipo de dato del parametro
    //  2. nombre del parametro

    public void addCar(carro c) {

    this.misCarros.add(c);

    } 

    //sobrecarga del metodo addCar
    public void addCar(String placa, TipoVehiculo tipoVehiculo) {

        //construir(instanciar)
        carro c = new carro();
        c.placa = placa;
        c.tipoVehiculo = tipoVehiculo;
        this.misCarros.add(c);

    }
    

    //sobrecarga de metodos
    //en una clase se permiten metodos
    //con el mismo nombre
    //con diferente firma

}

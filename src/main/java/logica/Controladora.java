/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

/**
 *
 * @author leand
 */
public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    public void ingresarAuto(String modelo, String marca, String motor, String color, String patente, int cantPuertas){
        Automovil auto = new Automovil();
        
        auto.setCantPuertas(cantPuertas);
        auto.setColor(color);
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setMotor(motor);
        auto.setPatente(patente);
        
        controlPersis.ingresarAuto(auto);
    }
    
    public List<Automovil> traerAutos(){
        return controlPersis.traerAutos();
    }

    public void eliminarAuto(int id) {
        controlPersis.eliminarAuto(id);
    }

    public Automovil traerAuto(int id) {
        return controlPersis.traerAuto(id);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String placa, int cantPuertas) {
auto.setModelo(modelo);
auto.setMarca(marca);
auto.setMotor(motor);
auto.setColor(color);
auto.setPatente(placa);
auto.setCantPuertas(cantPuertas);

//modifico la mascota
controlPersis.modificarAuto(auto);


    }
}

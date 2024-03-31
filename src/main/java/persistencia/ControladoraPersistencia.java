/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Automovil;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author leand
 */
public class ControladoraPersistencia {
    AutomovilJpaController autoJPA = new AutomovilJpaController();
    
    public void ingresarAuto(Automovil auto){
        autoJPA.create(auto);
    }

    public List<Automovil> traerAutos() {
      return  autoJPA.findAutomovilEntities();
    }

    public void eliminarAuto(int id) {
        try {
            autoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAuto(int id) {
        return autoJPA.findAutomovil(id);
    }

    public void modificarAuto(Automovil auto) {
        try {
            autoJPA.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

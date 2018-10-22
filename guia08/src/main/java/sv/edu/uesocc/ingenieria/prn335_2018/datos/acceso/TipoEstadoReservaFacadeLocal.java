/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2018.datos.acceso;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.datos.definicion.TipoEstadoReserva;

/**
 *
 * @author StevenCastro
 */
@Local
/**
 * Definicion de todas las firmas 
 * de  los metodos de tipoEstadoReserva
 */
public interface TipoEstadoReservaFacadeLocal {

   boolean create(TipoEstadoReserva tipoEstadoReserva);

   boolean edit(TipoEstadoReserva tipoEstadoReserva);

   boolean remove(TipoEstadoReserva tipoEstadoReserva);

   TipoEstadoReserva find(Object id);

   List<TipoEstadoReserva> findAll();

   List<TipoEstadoReserva> findRange(int desde, int hasta);

   int count();

}
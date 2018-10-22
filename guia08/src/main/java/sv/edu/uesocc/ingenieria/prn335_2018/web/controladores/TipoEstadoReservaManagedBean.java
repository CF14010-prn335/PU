/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2018.web.controladores;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import sv.edu.uesocc.ingenieria.prn335_2018.datos.acceso.TipoEstadoReservaFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.datos.definicion.TipoEstadoReserva;

/**
 *
 * @author StevenCastro
 */
@Named(value = "tipoEstadoReservaManagedBean")
@ViewScoped
public class TipoEstadoReservaManagedBean implements Serializable{

    @EJB
    TipoEstadoReservaFacadeLocal terRepo; 
    private TipoEstadoReserva ter = new TipoEstadoReserva();
    private  List<TipoEstadoReserva> terList ;
    
    public TipoEstadoReservaManagedBean() {
    }
    
    @PostConstruct
    public void post(){
        terList = terRepo.findAll();
    }
    
    public TipoEstadoReserva obtenerTipoEstadoReserva(){       
        return terRepo.find(ter);
    }
    
    
      public void crearTipoEstadoReserva(){
       terRepo.create(ter);
       ter = new TipoEstadoReserva();
       generarTabla();
       FacesContext.getCurrentInstance().addMessage("myForm", new FacesMessage("Se creó una nuevo registro de Tipo Estado Reserva"));
    }

        
    public boolean generarTabla(){
      terList = terRepo.findAll();
        return true;
     }
    
    public List<TipoEstadoReserva> getTipoEstadoReservaLista() {
        return terList;
    }

    public TipoEstadoReserva getTipoEstadoReserva() {
        return ter;
    }

    
    public void setTipoEstadoReserva(TipoEstadoReserva tipoEstadoReserva) {
        this.ter= tipoEstadoReserva;
    }
}
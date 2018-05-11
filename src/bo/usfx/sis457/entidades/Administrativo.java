/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;

/**
 *
 * @author Daniela Gonzales
 */
public class Administrativo extends Persona{
    protected String Cargo;
    protected String LugarTrabajo;
    protected Calendar FechaIngreso;
    
   public Administrativo(String carnetIdentidad, String nombre, Calendar fechaNacimiento, String cargo, String lugartrabajo, Calendar fechaingreso){
          super(carnetIdentidad, nombre, fechaNacimiento);
          this.Cargo  = cargo;
          this.LugarTrabajo = lugartrabajo;
          this.FechaIngreso = fechaingreso;      
   }
   public Administrativo() {
        
    }
    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public Calendar getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Calendar FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public String getLugarTrabajo() {
        return LugarTrabajo;
    }

    public void setLugarTrabajo(String LugarTrabajo) {
        this.LugarTrabajo = LugarTrabajo;
    }
   @Override
    public String toString() {
        return "Administrativo{" 
                + ", Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Cargo=" + Cargo
                + ", LugarTrabajo=" + LugarTrabajo
                + ", FechaIngreso=" + Utilitarios.getFechaCalendario(this.FechaIngreso);      
    }

}


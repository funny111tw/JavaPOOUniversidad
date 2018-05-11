/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Arrays;
import java.util.Calendar;

/**
 *
 * @author Carlos Gonzales
 */
public class DocenteContrato extends Docente {
    protected String NumerodeContrato;
    
     public DocenteContrato(String numerodecontrato, String []asignaturas, int añosdeexperiencia, String titulo, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.NumerodeContrato = numerodecontrato;
  
    }


    public DocenteContrato(String numerodecontrato) {
        this.NumerodeContrato = numerodecontrato;
    }

    public DocenteContrato() {
        
    }

    public String getNumerodeContrato() {
        return NumerodeContrato;
    }

    public void setNumerodeContrato(String numerodecontrato) {
        this.NumerodeContrato = numerodecontrato;
    }
    

   
    @Override
    public String toString() {
        return "Docente{" 
                + ", Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Titulo=" + this.Titulo 
                + ", AñosdeExperiencia=" + this.AñosdeExperiencia 
                + ", Asignaturas=" + Arrays.toString(this.Asignaturas)
                + ", NumerodeContrato=" + this.NumerodeContrato;
    }
    
}

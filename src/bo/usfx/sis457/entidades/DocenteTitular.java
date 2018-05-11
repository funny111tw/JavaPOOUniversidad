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
public class DocenteTitular extends Docente {
    
    protected String ExamendeCompetencia;
    
     public DocenteTitular(String examendecompetencia, String []asignaturas, int añosdeexperiencia, String titulo, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.ExamendeCompetencia = examendecompetencia;
  
    }


    public DocenteTitular(String examendecompetencia) {
        this.ExamendeCompetencia = examendecompetencia;
    }

    public DocenteTitular() {
        
    }

    public String getExamendeCompetencia() {
        return ExamendeCompetencia;
    }

    public void setExamendeCompetencia(String examendecompetencia) {
        this.ExamendeCompetencia = examendecompetencia;
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
                + ", ExamendeCompetencia=" + this.ExamendeCompetencia;
    }
 
   
}

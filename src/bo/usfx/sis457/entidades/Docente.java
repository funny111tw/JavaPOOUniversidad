/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Marcelo
 */
public class Docente extends Persona { 
    protected String Titulo;
    protected static int AñosdeExperiencia;
    protected String[] Asignaturas= new String[5]; 
    
 
    public Docente(String []asignaturas, int añosdeexperiencia, String titulo, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.AñosdeExperiencia = añosdeexperiencia;
        this.Titulo = titulo;
        this.Asignaturas = asignaturas;
    }

    public Docente(String []asignaturas, int añosdeexperiencia, String titulo) {
        this.AñosdeExperiencia = añosdeexperiencia;
        this.Titulo = titulo;
        this.Asignaturas = asignaturas;
    }

    public Docente() {
        
    }

    public Docente(String _, String fisica, String string, String licenciado_en_Informática, String string0, String juan_Perez, GregorianCalendar gregorianCalendar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Docente(String _, String ingeniero_de_Sistemas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Docente(String asignaturas, String añosdeexperiencia, String titulo, String carnetIdentidad, String nombre, Calendar fechaNacimientoCalendario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Docente(String asignaturas, int añosdeexperiencia, String titulo, String carnetIdentidad, String nombre, Calendar fechaNacimientoCalendario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getAñosdeExperiencia() {
        return AñosdeExperiencia;
    }

    public void setAñosdeExperiencia(int añosdeexperiencia) {
        this.AñosdeExperiencia = añosdeexperiencia;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getAsignaturas(String[] materias) {
        StringBuffer Asignaturas=new StringBuffer();
		for(int i=0; i<materias.length; i++){	
			Asignaturas.append("  ");
			Asignaturas.append(materias[i]);
		}
		return Asignaturas.toString();
    }

    public void setAsignaturas(String[] asignaturas) {
        this.Asignaturas = asignaturas;
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
                + ", Asignaturas=" + Arrays.toString(this.Asignaturas);
    }

    
}

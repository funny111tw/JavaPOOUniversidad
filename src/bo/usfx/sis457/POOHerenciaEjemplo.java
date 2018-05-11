/*
 * Archivo que contiene la Clase Principal del Programa
 * - En este ejemplo se muestra el principio de Herencia
 */
package bo.usfx.sis457;

import bo.usfx.sis457.entidades.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class POOHerenciaEjemplo {
    public static ArrayList<Persona> personas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personas = new ArrayList<>();
        
        personas.add(new Alumno("35-1", 1));
        personas.add(new Docente(" ", "fisica",  "10", "Licenciado en Informática", "222222", "Juan Perez", new GregorianCalendar(1980, 11,01)));
        personas.add(new Alumno("35-2", 1));
        personas.add(new Alumno("35-3", 1));
        personas.add(new Docente(" ", "Ingeniero de Sistemas"));
        personas.add(new Alumno("35-4", 1));
        
        menuPrincipal();
    }
    
    public static void menuPrincipal() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Programa: Universidad                            |");
        System.out.println("| - Ejemplo de Herencia                            |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Gestión de Personas                           |");
        System.out.println("| 2) Gestión de Docentes                           |");
        System.out.println("| 3) Gestión de Alumnos                            |");
        System.out.println("| 4) Gestión de Administrativos                    |");
        System.out.println("| 5) Gestión de Docentes Titulares                 |");
        System.out.println("| 6) Gestión de Docentes a Contrato                |");
        System.out.println("| 0) Salir                                         |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                menuPersonas();
                break;
            case "2":
                menuDocentes();
                break;
            case "3":
                menuAlumnos();
                break;
            case "4":
                menuAdministrativos();
                break;
            default:
                System.out.println("Salió del Programa");
        }        
    }
    
    public static void menuPersonas() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Personas                              |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Personas                               |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarPersonas();
                volverMenu();
                menuPersonas();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void menuDocentes() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Docentes                              |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Docentes                               |");
        System.out.println("| 2) Añadir Docente                                |");
        System.out.println("| 3) Modificar Docente                             |");
        System.out.println("| 4) Borrar Docente                                |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarDocentes();
                volverMenu();
                menuDocentes();
                break;
            case "2":
                anadirDocente();
                volverMenu();
                menuDocentes();
                break;
            case "3":
                modificarDocente();
                volverMenu();
                menuDocentes();
                break;
            case "4":
                borrarDocente();
                volverMenu();
                menuDocentes();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void menuAlumnos() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Alumnos                               |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Alumnos                                |");
        System.out.println("| 2) Añadir Alumno                                 |");
        System.out.println("| 3) Modificar Alumno                              |");
        System.out.println("| 4) Borrar Alumno                                 |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarAlumnos();
                volverMenu();
                menuAlumnos();
                break;
            case "2":
                anadirAlumno();
                volverMenu();
                menuAlumnos();
                break;
            case "3":
                modificarAlumno();
                volverMenu();
                menuAlumnos();
                break;
            case "4":
                borrarAlumno();
                volverMenu();
                menuAlumnos();
                break;
            default:
                menuPrincipal();
        }
    }
    public static void menuAdministrativos() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Administrativos                       |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Docentes                               |");
        System.out.println("| 2) Añadir Docente                                |");
        System.out.println("| 3) Modificar Docente                             |");
        System.out.println("| 4) Borrar Docente                                |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarAdministrativos();
                volverMenu();
                menuAdministrativos();
                break;
            case "2":
                anadirAdministrativos();
                volverMenu();
                menuAdministrativos();
                break;
            case "3":
                modificarAdministrativos();
                volverMenu();
                menuAdministrativos();
                break;
            case "4":
                borrarAdministrativos();
                volverMenu();
                menuAdministrativos();
                break;
            default:
                menuPrincipal();
        }
    }
    public static void menuDocentesTitulares() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Docentes Titulares                    |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Docentes                               |");
        System.out.println("| 2) Añadir Docente                                |");
        System.out.println("| 3) Modificar Docente                             |");
        System.out.println("| 4) Borrar Docente                                |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarDocentesT();
                volverMenu();
                menuDocentesTitulares();
                break;
            case "2":
                anadirDocenteT();
                volverMenu();
                menuDocentesTitulares();
                break;
            case "3":
                modificarDocenteT();
                volverMenu();
                menuDocentesTitulares();
                break;
            case "4":
                borrarDocenteT();
                volverMenu();
                menuDocentesTitulares();
                break;
            default:
                menuPrincipal();
        }
    }
    public static void menuDocentesContrato() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Docentes a Contrato                   |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Docentes                               |");
        System.out.println("| 2) Añadir Docente                                |");
        System.out.println("| 3) Modificar Docente                             |");
        System.out.println("| 4) Borrar Docente                                |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarDocentesC();
                volverMenu();
                menuDocentesContrato();
                break;
            case "2":
                anadirDocenteC();
                volverMenu();
                menuDocentesContrato();
                break;
            case "3":
                modificarDocenteC();
                volverMenu();
                menuDocentesContrato();
                break;
            case "4":
                borrarDocenteC();
                volverMenu();
                menuDocentesContrato();
                break;
            default:
                menuPrincipal();
        }
    }
    public static void volverMenu() {
        String opcion;
        Scanner entradaTeclado = new Scanner(System.in);
        while(true) {
            System.out.print("\nPresione M para continuar...");
            opcion = entradaTeclado.next();
            if (opcion.equals("M")) {
                break;
            }
        }
    }
    
    public static void listarPersonas() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Personas                              |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona persona: personas) {
            i++;
            System.out.println(i + ": " + persona);
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static int buscarPersona(int id) {
        boolean existe = false;
        int i = 0;
        for (Persona persona: personas) {
            if (persona.getId() == id) {
                existe = true;
                break;
            }
            i++;
        }
        return existe?i:-1;
    }
    
    public static void listarDocentes() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Docentes                           |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona docente: personas) {
            if (docente instanceof Docente) {
                i++;
                System.out.println(i + ": " + docente);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirDocente() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String titulo;
        int añosdeexperiencia;
        String asignaturas;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Docente                                  |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca el Título: ");
            titulo = entradaTeclado.readLine();
            System.out.print("Introduzca el Años de Experiencia: ");
            añosdeexperiencia = (Integer.parseInt(entradaTeclado.readLine()));
            System.out.print("Introduzca Las Asignaturas: ");
            asignaturas = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            personas.add(new Docente(asignaturas, añosdeexperiencia, titulo, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Profesor completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarDocente() {
        int id;
        Docente Docente;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Docente                               |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                Docente = (Docente)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + Docente.getCarnetIdentidad()+ "': ");
                Docente.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + Docente.getNombre() + "': ");
                Docente.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(Docente.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                Docente.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Introduzca el Título Universitario: ");
                Docente.setTitulo(entradaTeclado.readLine());
                System.out.print("Modificar los Años de Experiencia '" + Docente.getAñosdeExperiencia()+ "': ");
                Docente.setAñosdeExperiencia(Integer.parseInt(entradaTeclado.readLine()));
                System.out.print("Modificar Las Asignaturas: ");
                Docente.setAsignaturas (entradaTeclado.readLine());
                personas.set(id, Docente);
                System.out.println("Registro de Docente modificado!");
            } else {
                System.out.println("El Registro de Docente no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarDocente() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Docente                                  |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Docente borrado!");
            } else {
                System.out.println("El Registro de Docente no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void listarAlumnos() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Alumnos                               |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona alumno: personas) {
            if (alumno instanceof Alumno) {
                i++;
                System.out.println(i + ": " + alumno);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirAlumno() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String carnetUniversitario;
        String asignaturas;
        int semestre;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Alumno                                    |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca el CU: ");
            carnetUniversitario = entradaTeclado.readLine();
            System.out.print("Introduzca el Semestre: ");
            semestre = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Introduzca Las Asignaturas: ");
            asignaturas = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            personas.add(new Alumno(asignaturas, carnetUniversitario, semestre, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Docente completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarAlumno() {
        int id;
        Alumno alumno;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Alumno                                 |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                alumno = (Alumno)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + alumno.getCarnetIdentidad()+ "': ");
                alumno.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + alumno.getNombre() + "': ");
                alumno.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(alumno.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                alumno.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar el CU '" + alumno.getCarnetUniversitario() + "': ");
                alumno.setCarnetUniversitario(entradaTeclado.readLine());
                System.out.print("Modificar Las Asignaturas: ");
                alumno.setAsignaturas (entradaTeclado.readLine());
                System.out.print("Introduzca el Semestre: ");
                alumno.setSemestre(Integer.parseInt(entradaTeclado.readLine()));
                personas.set(id, alumno);
                System.out.println("Registro de Alumno modificado!");
            } else {
                System.out.println("El Registro de Alumno no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarAlumno() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Alumno                                    |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Alumno borrado!");
            } else {
                System.out.println("El Registro de Alumno no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
   public static void listarAdministrativos() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Administrativos                           |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona administrativo: personas) {
            if (administrativo instanceof Administrativo) {
                i++;
                System.out.println(i + ": " + administrativo);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirAdministrativos() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String cargo;
        String lugarTrabajo;
        String fechaIngreso;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Administrativo                                  |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca el Cargo: ");
            cargo = entradaTeclado.readLine();
            System.out.print("Introduzca el Lugar de Trabajo: ");
            lugarTrabajo = entradaTeclado.readLine();
            System.out.print("Introduzca el Lugar de Fecha de Ingreso: ");
            fechaIngreso = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            personas.add(new Docente(cargo, lugarTrabajo, fechaIngreso, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Administrativo completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarAdministrativos() {
        int id;
        Administrativo Administrativo;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Administrativo                               |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Administrativo a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                Administrativo = (Administrativo)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + Administrativo.getCarnetIdentidad()+ "': ");
                Administrativo.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + Administrativo.getNombre() + "': ");
                Administrativo.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(Administrativo.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                Administrativo.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar el Cargo '" + Administrativo.getCargo()+ "': ");
                Administrativo.setCargo(entradaTeclado.readLine());
                System.out.print("Modificar el Lugar de Trabajo: ");
                Administrativo.setLugarTrabajo(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Ingreso: " + Utilitarios.getFechaCalendario(Administrativo.getFechaIngreso()) + "': ");
                Date fechaIngresoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaIngresoCalendario = Calendar.getInstance();
                fechaIngresoCalendario.setTime(fechaIngresoDate);
                Administrativo.setFechaNacimiento(fechaIngresoCalendario);
                personas.set(id, Administrativo);
                System.out.println("Registro de Administrativo modificado!");
            } else {
                System.out.println("El Registro de Administrativo no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarAdministrativos() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Administrativo                            |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Administrativo a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Administrativo borrado!");
            } else {
                System.out.println("El Registro de Administrativo no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    
    public static void listarDocentesT() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Docentes Titulares                    |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona docente: personas) {
            if (docente instanceof Docente) {
                i++;
                System.out.println(i + ": " + docente);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirDocenteT() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String titulo;
        int añosdeexperiencia;
        String examendecompetencia;
        String asignaturas;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Docente Titular                           |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca el Título: ");
            titulo = entradaTeclado.readLine();
            System.out.print("Introduzca el Años de Experiencia: ");
            añosdeexperiencia = (Integer.parseInt(entradaTeclado.readLine()));
            System.out.print("Introduzca Las Asignaturas: ");
            asignaturas = entradaTeclado.readLine();
            System.out.print("Introduzca el Examen de Competencia: ");
            examendecompetencia = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            personas.add(new Docente(examendecompetencia, asignaturas, añosdeexperiencia, titulo, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Profesor completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarDocenteT() {
        int id;
        DocenteTitular DocenteTitular;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Docente Titular                        |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                DocenteTitular = (DocenteTitular)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + DocenteTitular.getCarnetIdentidad()+ "': ");
                DocenteTitular.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + DocenteTitular.getNombre() + "': ");
                DocenteTitular.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(DocenteTitular.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                DocenteTitular.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Introduzca el Título Universitario: ");
                DocenteTitular.setTitulo(entradaTeclado.readLine());
                System.out.print("Introduzca el Examen de Competencia: ");
                DocenteTitular.setExamendeCompetencia (entradaTeclado.readLine());
                System.out.print("Modificar Las Asignaturas: ");
                DocenteTitular.setAsignaturas (entradaTeclado.readLine());
                System.out.print("Modificar los Años de Experiencia '" + DocenteTitular.getAñosdeExperiencia()+ "': ");
                DocenteTitular.setAñosdeExperiencia(Integer.parseInt(entradaTeclado.readLine()));
                personas.set(id, DocenteTitular);
                System.out.println("Registro de Docente modificado!");
            } else {
                System.out.println("El Registro de Docente no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarDocenteT() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Docente Titular                           |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Docente borrado!");
            } else {
                System.out.println("El Registro de Docente no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void listarDocentesC() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Docentes a Contrato                   |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona docente: personas) {
            if (docente instanceof Docente) {
                i++;
                System.out.println(i + ": " + docente);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirDocenteC() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String titulo;
        int añosdeexperiencia;
        String numerodecontrato;
        String asignaturas;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Docente Titular                           |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca el Título: ");
            titulo = entradaTeclado.readLine();
            System.out.print("Introduzca el Años de Experiencia: ");
            añosdeexperiencia = (Integer.parseInt(entradaTeclado.readLine()));
            System.out.print("Introduzca Las Asignaturas: ");
            asignaturas = entradaTeclado.readLine();
            System.out.print("Introduzca el numero de Contrato: ");
            numerodecontrato = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            personas.add(new Docente(numerodecontrato, asignaturas, añosdeexperiencia, titulo, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Profesor completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarDocenteC() {
        int id;
        DocenteContrato DocenteContrato;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Docente Titular                        |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                DocenteContrato = (DocenteContrato)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + DocenteContrato.getCarnetIdentidad()+ "': ");
                DocenteContrato.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + DocenteContrato.getNombre() + "': ");
                DocenteContrato.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(DocenteContrato.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                DocenteContrato.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Introduzca el Título Universitario: ");
                DocenteContrato.setTitulo(entradaTeclado.readLine());
                System.out.print("Introduzca el Numero de Contrato: ");
                DocenteContrato.setNumerodeContrato (entradaTeclado.readLine());
                System.out.print("Modificar Las Asignaturas: ");
                DocenteContrato.setAsignaturas (entradaTeclado.readLine());
                System.out.print("Modificar los Años de Experiencia '" + DocenteContrato.getAñosdeExperiencia()+ "': ");
                DocenteContrato.setAñosdeExperiencia(Integer.parseInt(entradaTeclado.readLine()));
                personas.set(id, DocenteContrato);
                System.out.println("Registro de Docente modificado!");
            } else {
                System.out.println("El Registro de Docente no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarDocenteC() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Docente Titular                           |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Docente borrado!");
            } else {
                System.out.println("El Registro de Docente no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    /**
     * Método que limpia pantalla de la consola. Funciona fuera de NetBeans.
     */
    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

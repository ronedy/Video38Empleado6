/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video38Empleado6Kev;

import java.util.*;

public class Empleado {
    
    public Empleado(String nom){
        
        nombre = nom;
        seccion = "Administracion";
        Id=IdSiguiente;
        IdSiguiente++;
    }

    
    public void cambiaSeccion(String seccion){
        
        this.seccion = seccion;
        
    }
    
    
    public String devuelveDatos(){
        
        return "El nombre es: " + nombre + " y la sección es " + seccion + 
                " Y EL ID = " + Id;
        
    }
    
    public static String dameId(){
        
        return " El siguiente ID es: " + IdSiguiente;
        
    }
    
    private final String nombre;
    private String seccion;
    private int Id;
    private static int IdSiguiente =1;
    
}

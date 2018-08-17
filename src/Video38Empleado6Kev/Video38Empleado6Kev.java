/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video38Empleado6Kev;


public class Video38Empleado6Kev {

    
    public static void main(String[] args) {
     
        
        Empleado trabajador1 = new Empleado("Paco");      
        Empleado trabajador2 = new Empleado("Ana");      
        Empleado trabajador3 = new Empleado("Antonio");     
        Empleado trabajador4 = new Empleado(" Maria");
        
        trabajador1.cambiaSeccion("RRHH");
        
        System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + 

                "\n" + trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());  
        
        
       System.out.println(Empleado.dameId());
    }
    
}

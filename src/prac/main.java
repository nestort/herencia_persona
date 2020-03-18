/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac;

/**
 *
 * @author Trinidad
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Personal a=new Personal();
       alumno al=new alumno();
       
       //empleado
       empleado jardineroWilli=new empleado();
       jardineroWilli.setSueldo(80.0f);       
       System.out.println(jardineroWilli.CalculaSueldo(7));
       
        //docente
       docente santos=new docente();
       santos.setSueldo(80.0f);
       System.out.println(santos.CalculaSueldo(7));
       
       
         //docente
       administrativo SecreMaria=new administrativo();
       SecreMaria.setSueldo(80.0f);
       System.out.println(SecreMaria.CalculaSueldo(7));
       
    }
    
}

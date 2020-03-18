/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac;

/**
 *
 * @author LTI-2
 */
public class empleado extends Personal {
    //
    Float sueldo;
    //

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }
    
    public float CalculaSueldo(int NoDias){
        return NoDias*sueldo;
         
    }
    
}

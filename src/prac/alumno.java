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
public class alumno extends Personal {
    
    String numcontrol;
    String carrera;
    String nss;
    String fechaingreso;
    
    //
    
    //

    public String getNumcontrol() {
        return numcontrol;
    }

    public void setNumcontrol(String numcontrol) {
        this.numcontrol = numcontrol;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }
}

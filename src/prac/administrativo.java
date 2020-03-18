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
    public class administrativo extends empleado {
        String numtarjeta;
        String subdir;
        String depto;



        @Override
         public float CalculaSueldo(int NoDias){

             return NoDias*sueldo*0.5f;
        }

    }

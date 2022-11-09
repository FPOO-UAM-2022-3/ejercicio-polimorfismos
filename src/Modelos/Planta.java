/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author pipet
 */
public class Planta extends Empleado{
    private int añoIngreso;

    public Planta(String id, double salario,int añoIngreso) {
        super(id, salario);
        this.añoIngreso = añoIngreso;
    }

    /**
     * @return the añoIngreso
     */
    public int getAñoIngreso() {
        return añoIngreso;
    }

    /**
     * @param añoIngreso the añoIngreso to set
     */
    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }
    
}

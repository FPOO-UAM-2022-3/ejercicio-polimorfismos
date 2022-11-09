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
public class Contratista extends Empleado{
    private int duracion;

    public Contratista(String id, double salario,int duracion) {
        super(id, salario);
        this.duracion = duracion;
    }
    @Override
    public double calcularSalario(){
        double salarioFinal=0.0;
        double descuento=this.getSalario()*0.1;
        salarioFinal=this.getSalario()-descuento;
        return salarioFinal;
    }
    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Admin
 */
public class animal {

    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public animal() {
    }

    public animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + ", raza=" + raza + '}';
    }
    
    
    //METODOS   
             
    public void alimentar(){
        
        System.out.println("yo me alimento de "+ alimento);
        
        
    
    }

}

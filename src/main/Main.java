/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;
import entidad.animal;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gato a1= new Gato("linda", "purina", 3, "negra");
        Perro b =new Perro("cooper", "sobras", 9, "labrachicha");
        Caballo c=new Caballo("pimienta", "alfalfa", 10, "mestiza");
        
        a1.alimentar();
        b.alimentar();
        c.alimentar();
    }
    
}

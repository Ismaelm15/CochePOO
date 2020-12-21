/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

/**
 *
 * @author profesor
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Motor m1 = new Motor(true, 6);
        Motor m2 = new Motor(false, 4);

        Rueda r1 = new Rueda(true, "Invierno");
        Rueda r2 = new Rueda(true, "Verano");

        Ventana v1 = new Ventana(false, true);
        Ventana v2 = new Ventana(true, true);
        
        Puerta p1 = new Puerta(false, v1);
        Puerta p2 = new Puerta(true, v2);
//        
//        System.out.println(p1);
//        
//        // Abrir la ventana de la puerta p1
//        // p1.getVentana() --> ventana
//        
//        p1.getVentana().abrir();
        Coche coche = new Coche();
        coche.getMotor().apagar();
        coche.getPuertas().cerrar();
        coche.getRueda1().inflar();
        coche.getRueda2().inflar();
        coche.getRueda3().inflar();
        coche.getRueda4().inflar();

        Coche coche2 = new Coche(new Motor(false, 5), new Puerta(false,
                new Ventana(false, false)), new Rueda(true, "verano"), 
                new Rueda(true, "verano"),new Rueda(true, "verano"),
                new Rueda(true, "verano"));
        
        coche2.getRueda3().setTipo("Invierno");
               
        Coche coche3 = new Coche(new Motor(false, 5), new Puerta(false,
                new Ventana(false, false)), r1, 
                new Rueda(true, "verano"),new Rueda(true, "verano"),
                new Rueda(true, "verano"));
    }

}
